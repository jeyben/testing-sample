# Testing sample
### TLDR  
This java project is build on a single logic class with different testcases around that logic class.  
It uses Jacoco and PiTesting to measure test quality in different ways.  

Its purpose is to simply shed light on the rather false security that measuring code coverage represents.  
By introducing mutation testing, a better Test quality can be measured, but the conclusion is that it is
very hard to setup a single metric that measures the quality of the tests in a given project. 

You can see pre calculated reports for the code coverage and mutation testing here:
- [Thoughts of code coverage](/code-coverage.md)
- [Thoughts of mutation testing](/mutation-testing.md)

## What is tested?

The simple logic class that is being tested and some testcases are defined here:
- [Service logic being tested](/src/main/java/com/eybenconsult/testing/sample/LogicService.java)
- [Test cases defined here](/src/test/java/com/eybenconsult/testing/sample/LogicServiceTest.java)

## Run the project
I urgh you to checkout and run the project yourself and change and play with the testcases and see what happens with the reports.

### Code coverage report
To create a code coverage report (using jacoco), run the following:
```
$ mvn clean verify
```

### Mutation testing report
To create a mutation testing report (includes code coverage), run PiTesting and generate the report. Run the following commands after the project has been built:
```
$ mvn org.pitest:pitest-maven:mutationCoverage
```

