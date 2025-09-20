# Testing sample
The purpose of this project is to shed some light on how hard it is to actually measure good test quality.

It focuses on code coverage, which is a metric that is often used in measuring test quality.  

It also shows some of the strength and weakness of using mutation testing as an alternative to code coverage.

For the simplicity, this java project is build around a single logic method with some different testcases to that method.  
It uses Jacoco and PiTesting to measure test quality in different ways.

The simple logic class that is being tested and some testcases are defined here:
- [Service logic being tested](/src/main/java/com/eybenconsult/testing/sample/LogicService.java)
- [Test cases defined here](/src/test/java/com/eybenconsult/testing/sample/LogicServiceTest.java)

## Thoughts and Conclusions
You can see some thoughts and pre calculated reports for the code coverage and mutation testing here:
- [Thoughts of code coverage](/code-coverage.md)
- [Thoughts of mutation testing](/mutation-testing.md)

# Run the project yourself
The project is built using maven, so you can run it yourself. 
I urgh you to checkout and run the project yourself and change and play with the testcases and see what happens with the reports.

### Code coverage report
To create a code coverage report (using jacoco), run the following:
```
$ mvn clean verify
```

### Mutation testing report
To create a mutation testing report, (using PiTest), run the following:
```
$ mvn clean verify
$ mvn org.pitest:pitest-maven:mutationCoverage
```

