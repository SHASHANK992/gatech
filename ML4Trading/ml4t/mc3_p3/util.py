"""MLT: Utility code."""

import os
import pandas as pd
import numpy as np
import matplotlib.pyplot as plt

def symbol_to_path(symbol, base_dir=os.path.join("..", "data")):
    """Return CSV file path given ticker symbol."""
    return os.path.join(base_dir, "{}.csv".format(str(symbol)))


def get_data(symbols, dates, addSPY=True):
    """Read stock data (adjusted close) for given symbols from CSV files."""
    df = pd.DataFrame(index=dates)
    if addSPY and 'SPY' not in symbols:  # add SPY for reference, if absent
        symbols = ['SPY'] + symbols

    for symbol in symbols:
        df_temp = pd.read_csv(symbol_to_path(symbol), index_col='Date',
                parse_dates=True, usecols=['Date', 'Adj Close'], na_values=['nan'])
        df_temp = df_temp.rename(columns={'Adj Close': symbol})
        df = df.join(df_temp)
        if symbol == 'SPY':  # drop dates SPY did not trade
            df = df.dropna(subset=["SPY"])

    return df


def plot_data(df, title="Stock prices", xlabel="Date", ylabel="Price"):
    """Plot stock prices with a custom title and meaningful axis labels."""
    ax = df.plot(title=title, fontsize=12)
    ax.set_xlabel(xlabel)
    ax.set_ylabel(ylabel)
    plt.show()


def get_portfolio_stats(port_val):
    cum_ret = (port_val[-1]/port_val[0])-1
    
    daily_return = (port_val/np.roll(port_val,1))-1
    
    avg_daily_ret = np.mean(daily_return[1:])
    
    std_daily_ret = np.std(daily_return[1:], ddof=1)
    
    # Assume risk free rate = 0.0 and 252 trading dates per year
    k = np.sqrt(252.0)
    sharpe_ratio = k*(avg_daily_ret/std_daily_ret)
    
    return cum_ret, avg_daily_ret, std_daily_ret, sharpe_ratio
# get_portfolio_stats