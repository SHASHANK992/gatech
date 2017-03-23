CS7641 Assignment 2 Readme

To build ABAGAIL and the java class for my tests, follow these steps

1) Download and install Apache Ant. 
	a) I used version 1.9.4
	   http://ant.apache.org/bindownload.cgi
	b) Create ANT_HOME environment variable
	   I placed the program in C:\Program Files\apache-ant-1.9.4
	   ANT_HOME = C:\Program Files\apache-ant-1.9.4
	c) Added the Ant bin directory to the PATH environment variable
	   PATH = C:\Program Files\apache-ant-1.9.4\bin
2) Download and install the Java Development Kit
	a) I used JDK 1.8.0u20
	   http://www.oracle.com/technetwork/java/javase/downloads/index-jsp-138363.html#javasejdk
	b) Set the JAVA_HOME environment variable
	   JAVA_HOME = C:\Program Files (x86)\Java\jdk1.8.0_20
3) Download ABAGAIL
	a) Downloaded a zip of the repository from https://github.com/pushkar/ABAGAIL
	b) Unzipped the repository to My Documents C:\Users\Samsung\Documents\ABAGAIL
4) Build ABAGAIL
	a) Place NNTest.java and FitnessFunctionTest.java in src\opt\test under the ABAGAIL directory
	b) Place the fitness functions (JRKFitnessFunction[One,Two,Three]) in src\opt\example
	b) Open command prompt
	c) Change directory to ABAGAIL folder
	   cd C:\Users\Samsung\Documents\ABAGAIL
	d) Build
      	   ant
	e) Run ABAGAIL
	   java -cp ABAGAIL.jar opt.test.[Insert name of test here]
	f) The output is stored in files in the ABAGAIL directory as well as in the console output
	
NOTE: For some tests, such as the FitnessFunctionTest, I manually changed the number of inputs as
	  well as the maximum fitness function value.


