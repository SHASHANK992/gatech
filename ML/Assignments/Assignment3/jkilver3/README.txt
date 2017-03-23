CS7641
Assignment 3 README
Jacob Kilver
9 November 2014


I used Weka 3.7.11 with the student-filters package installed for this assignment.These are the steps I followed in order:

- Used the original data sets with both k-means and expectation maximization clustering algorithms.
- Used the original data sets with dimensionality reduction algorithms. These data sets were saved for later processing.
	- PCA 
	- ICA -> via the preprocessing tab
	- RCA -> via the preprocessing tab
	- Information Gain
	NOTE: ICA and RCA were only available as filters, not as actual algorithms. As such, the information available 
	for PCA was not available for ICA and RCA. 
	NOTE: ICA would not converge for the adult income data set.
- Used the data sets with the now reduced/transformed features to train neural networks
- Performed clustering with the new reduced/transformed data sets
	- kMeans
	- Expectation Maximization
- Generated new data sets where the clusters were the features. Used these data sets to train neural networks.
	-kMeans
		- PCA
		- ICA
		- RCA
		- Information Gain
	- EM
		- PCA
		- ICA
		- RCA
		- Information Gain	