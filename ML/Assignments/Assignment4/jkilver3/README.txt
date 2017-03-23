I used BURLAP to conduct my experiments. See this website to download
and use the software:

http://burlap.cs.brown.edu/

I cloned the directory from GitHub so that I would have all the dependencies.
I build the burlap.jar library file from the source code using the instructions
on the website.

Within the BURLAP directory I created a new directory named Assignment4.
In that directory I made a new directory named lib and copied the burlap.jar 
file I built from the BURLAP source code into it. You are now ready to use
the included .java files.

- Open command prompt and navigate to the Assignment4 directory
- Place the SmallMDP.java and the LargeMDP.java files in this directory
- Build
	javac -cp lib/* SmallMDP.java
	javac -cp lib/* LargeMDP.java
- Run
	java -cp lib/*;. SmallMDP.java
	java -cp lib/*;. LargeMDP.java
	Note: you may have to replace ; with : depending on which OS you use

Note: To run the various tests, open the source files and comment/uncomment
      the appropriate lines in the main and constructor methods.