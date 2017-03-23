######################################################################
# Task: Describe a two-tape Turing machine that recognizes the 
# language {x#y | x is a substring of y and x,y in {0,1}^* }
######################################################################
# Enter values below for
# q_0 : the initial state (an int)
# q_a : the accept state (an int)
# q_r : the reject state (an int)
# delta : the transition function expressed as a dictionary
#         with keys (state, symbol, symbol) and 
#		  values (state, symbol, symbol,{L,S,R},{L,S,R})
# Use the 'b' character for the blank symbol.
#
# For example, you might express the TM that turns input x into
# x#x as follows:
#
# q_0 = 0
# q_a = 4
# q_r = 5
#
# delta = {}
# #Leave a blank at the beginning of the second tape.
# delta[(0,'0','b')] = (1,'0','b','S','R')
# delta[(0,'1','b')] = (1,'1','b','S','R')
# delta[(0,'b','b')] = (4,'#','b','R','R')

# #Copy the 1st onto the 2nd tape
# delta[(1,'0','b')] = (1,'0','0','R','R')
# delta[(1,'1','b')] = (1,'1','1','R','R')
# delta[(1,'b','b')] = (2,'#','b','S','L')

# #Rewind the 2nd tape
# delta[(2,'#','0')] = (2,'#','0','S','L')
# delta[(2,'#','1')] = (2,'#','1','S','L')
# delta[(2,'#','b')] = (3,'#','b','R','R')

# #Copy from 2nd to 1st
# delta[(3,'b','0')] = (3,'0','0','R','R')
# delta[(3,'b','1')] = (3,'1','1','R','R')
# delta[(3,'b','b')] = (4,'b','b','S','S')
######################################################################

#Test Run will test your machine on this input.
#test_tape = ['0','1','#','1','0','1','0']
#test_tape = [ '1','1','0','0','#','1','0','0','1','1','1','0','0','1','1','1','0','0','0','1','1','0','1','1']
test_tape = ['0','0','0','#','0','0','1','1','1','0','1','0','1','1']

#Specify the Multitape machine here
q_0 = 0
q_1 = 1
q_2 = 2
q_3 = 3
q_4 = 4
q_5 = 5
q_6 = 6
q_7 = 7
q_8 = 8
q_9 = 9
q_10 = 10
q_11 = 11
q_a = 555
q_r = 999

delta = {}
#q0 - put blank at beginning of second tape
delta[(0,'0','b')] = (1,'0','b','S','R')
delta[(0,'1','b')] = (1,'1','b','S','R')
delta[(0,'b','b')] = (555,'b','b','S','S')
delta[(0,'#','b')] = (1,'#','b','S','R')

#q1 - copy everything from tape1 to tape 2 up to #
delta[(1,'0','b')] = (1,'0','0','R','R')
delta[(1,'1','b')] = (1,'1','1','R','R')
delta[(1,'#','b')] = (2,'#','b','R','L')

#q2 - rewind second tape to the beginning
# if a blank is found, we are at the beginning
delta[(2,'0','b')] = (3,'0','b','S','R')
delta[(2,'1','b')] = (3,'1','b','S','R')
#otherwise rewind
delta[(2,'0','0')] = (2,'0','0','S','L')
delta[(2,'0','1')] = (2,'0','1','S','L')
delta[(2,'1','0')] = (2,'1','0','S','L')
delta[(2,'1','1')] = (2,'1','1','S','L')

#q3 - look for start of substring in tape1
delta[(3,'b','b')] = (555,'b','b','S','S')
delta[(3,'0','b')] = (555,'0','b','S','S')
delta[(3,'1','b')] = (555,'1','b','S','S')
#If the end of tape1 is reached and the end of tape2 is not reached,
# then there is no substring match
delta[(3,'b','0')] = (999,'b','0','S','S')
delta[(3,'b','1')] = (999,'b','1','S','S')
# tapes don't match. Continue to advance tape 1, keep tape 2 where it is
delta[(3,'0','1')] = (3,'0','1','R','S')
delta[(3,'1','0')] = (3,'1','0','R','S')
# tapes do match. Go to respective substring start found state
delta[(3,'0','0')] = (4,'0','0','R','R')
delta[(3,'1','1')] = (5,'1','1','R','R')
#**************************UP TO HERE IS GOOD*******************************************************


#q4 - Found start of substring starting with 0. 
delta[(4,'b','b')] = (555,'b','b','S','S')
delta[(4,'0','b')] = (555,'0','b','S','S')
delta[(4,'1','b')] = (555,'1','b','S','S')
delta[(4,'b','0')] = (999,'b','0','S','S')
delta[(4,'b','1')] = (999,'b','1','S','S')
# tapes don't match. Keep tape1 head in place, rewind tape 2 to beginning
delta[(4,'0','1')] = (2,'0','1','S','L')
delta[(4,'1','0')] = (2,'1','0','S','L')
# tapes do match.
# If the match is a zero, we have to note that it could be the start of a new substring
delta[(4,'0','0')] = (6,'0','0','S','S')
delta[(4,'1','1')] = (4,'1','1','R','R')

#q5 - Found start of substring starting with 1 
delta[(5,'b','b')] = (555,'b','b','S','S')
delta[(5,'0','b')] = (555,'0','b','S','S')
delta[(5,'1','b')] = (555,'1','b','S','S')
delta[(5,'b','0')] = (999,'b','0','S','S')
delta[(5,'b','1')] = (999,'b','1','S','S')
# tapes don't match. Keep tape1 head in place, rewind tape 2 to beginning
delta[(5,'0','1')] = (2,'0','1','S','L')
delta[(5,'1','0')] = (2,'1','0','S','L')
# tapes do match.
# If the match is a one, we have to note that it could be the start of a new substring
delta[(5,'0','0')] = (5,'0','0','R','R')
delta[(5,'1','1')] = (7,'1','1','S','S')

#q6 - found potential new substring start with 0
# keep track of this by writing a b to tape1
delta[(6,'0','0')] = (8,'b','0','R','R')


#q7 - found potential new substring start with 1
# keep track by writing a b to tape1
delta[(7,'1','1')] = (9,'b','1','R','R')


#q8 - keep matching - don't care about other potential substring starts at this point
delta[(8,'b','b')] = (555,'b','b','S','S')
delta[(8,'0','b')] = (555,'0','b','S','S')
delta[(8,'1','b')] = (555,'1','b','S','S')
#If the end of tape1 is reached and the end of tape2 is not reached,
# then there is no substring match
delta[(8,'b','0')] = (999,'b','0','S','S')
delta[(8,'b','1')] = (999,'b','1','S','S')
# tapes don't match. go to rewind state
delta[(8,'0','1')] = (10,'0','1','L','L')
delta[(8,'1','0')] = (10,'1','0','L','L')
# tapes do match. remain in this state
delta[(8,'0','0')] = (8,'0','0','R','R')
delta[(8,'1','1')] = (8,'1','1','R','R')


#q9 - keep matching - don't care about other potential substring starts at this point
delta[(9,'b','b')] = (555,'b','b','S','S')
delta[(9,'0','b')] = (555,'0','b','S','S')
delta[(9,'1','b')] = (555,'1','b','S','S')
#If the end of tape1 is reached and the end of tape2 is not reached,
# then there is no substring match
delta[(9,'b','0')] = (999,'b','0','S','S')
delta[(9,'b','1')] = (999,'b','1','S','S')
# tapes don't match. go to rewind state
delta[(9,'0','1')] = (11,'0','1','L','L')
delta[(9,'1','0')] = (11,'1','0','L','L')
# tapes do match. remain in this state
delta[(9,'0','0')] = (9,'0','0','R','R')
delta[(9,'1','1')] = (9,'1','1','R','R')



#q10 - rewind until b is found in both tapes. write 0 in place of b in tape 1
delta[(10,'b','b')] = (4,'0','b','R','R')
delta[(10,'0','0')] = (10,'0','0','L','L')
delta[(10,'0','1')] = (10,'0','1','L','L')
delta[(10,'1','0')] = (10,'1','0','L','L')
delta[(10,'1','1')] = (10,'1','1','L','L')
delta[(10,'b','0')] = (10,'b','0','S','L')
delta[(10,'b','1')] = (10,'b','1','S','L')
delta[(10,'0','b')] = (10,'0','b','L','S')
delta[(10,'1','b')] = (10,'1','b','L','S')


#q11 - rewind until b is found in both tapes. write 1 in place of b in tape 1
delta[(11,'b','b')] = (5,'1','b','R','R')
delta[(11,'0','0')] = (11,'0','0','L','L')
delta[(11,'0','1')] = (11,'0','1','L','L')
delta[(11,'1','0')] = (11,'1','0','L','L')
delta[(11,'1','1')] = (11,'1','1','L','L')
delta[(11,'b','0')] = (11,'b','0','S','L')
delta[(11,'b','1')] = (11,'b','1','S','L')
delta[(11,'0','b')] = (11,'0','b','L','S')
delta[(11,'1','b')] = (11,'1','b','L','S')




