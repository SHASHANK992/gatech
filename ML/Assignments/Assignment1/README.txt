Jacob Kilver
CS 7641
Assignment 1
26 Sept 2014

I used Weka 3.6.11 to run my simulations. I did the simulations manually, i.e., 
I did not interface to any Java code and so I have no actual code to submit.
I will record what learning algorithms I used and what parameters I changed from
the defaults.

Adult Income Data Set
	Decision Tree - J48 (Java version of C4.8)
	Neural Network - MultilayerPerceptron with hidden layers restricted to 2
	kNN - IBk with k values of 1, 5, and 10
	Boosting - AdaBoostM1 with a classifier of J48
	SVM - LibSVM with Radial Basis (degree=3) and Polynomial (degree=3)
	
	
Bank note Authentication
	Decision Tree - J48 (Java version of C4.8)
	Neural Network - MultilayerPerceptron with hidden layers restricted to 2
	kNN - IBk with k values of 1, 2, and 5
	Boosting - AdaBoostM1 with a classifier of J48
	SVM - SMO with kernel functions radial basis and polykernel (exponent = 2)





