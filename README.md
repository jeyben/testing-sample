# Testing sample
The purpose of this project is to shed some light on how hard it is to actually measure good test quality.

It focuses on code coverage and mutation testing as they are easy to measure and often used when talking about the test quality.

For the simplicity, this java project is build around a single logic method with some different testcases to that method.  
It uses Jacoco and PiTesting to measure test quality in different ways.

The simple logic class that is being tested and some testcases are defined here:
- [Service logic being tested](/src/main/java/com/eybenconsult/testing/sample/LogicService.java)
- [Test cases defined here](/src/test/java/com/eybenconsult/testing/sample/LogicServiceTest.java)

## Thoughts about code coverage and mutation testing
You can see some thoughts and pre calculated reports for the code coverage and mutation testing here:
- [Thoughts of code coverage](/code-coverage.md)
- [Thoughts of mutation testing](/mutation-testing.md)

Even though we can achieve 100% line coverage and 100% mutation coverage, we still haven´t found some of the implementation errors in the businesslogic.

These two testcases will both break and reveal the implementation is not completely correct and fault tolerant.   
The point is, that no metric would enforce these testcases to be created.
- [testAdd_Assertions_3](/src/test/java/com/eybenconsult/testing/sample/LogicServiceTest.java#L51)
- [testAdd_Assertions_4](/src/test/java/com/eybenconsult/testing/sample/LogicServiceTest.java#L61)

## Conclusion
This project and the simple testcases, shows how we can achieve 100% line coverage and also 100% mutation coverage, but still fail the requirements.  
Hence one should be **very careful** when using code coverage and mutation testing as key metric for measuring the quality of any code.  
As they tend to give a false sense of security.

### Suggestion
As it is absolutely **not cost-free** to write and maintain a test suite, consider approaching the test coverage with the following questions.

* What is the chances of this part of the code will break? *examples*
  * does it depend on third-party services or libraries? (maybe http services, that could be down) 
  * is it subject to frequent changes in requirements or business rules? 
  * is it inherently complex (e.g., heavy concurrency or tricky algorithms)?
* What is the risk if it does break? *examples*  
  * could it trigger incorrect invoices that cost the business money?
  * expose sensitive customer data and create legal liabilities?
  * cause an outage that damages reputation?

For the code that scores high in questions like the above, you should consider writing extensive test suites with proper types of tests, 
while for the code that scores low, you could consider writing a minimal test suite.

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

