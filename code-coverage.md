# Code coverage
By running a test without single assertion, we can achieve 100% line coverage.
That leads to a very false sense of security.

What code coverage actually concludes is:
* That the code is executed during test execution.
* That the code did not throw an exception during this exact execution.

What it **doesn't** conclude is:
* That the code actually works as the business expects.
* That high load is handled correctly.
* That the code is thread safe.
* That the code is memory safe.
* That the code is secure.
* That the code is fault tolerant.
* That the code is resilient.
* That the code is scalable.
* That the code is performant.
* That the code is maintainable.

### Example
This "test" will provide 100% line coverage of the LogicService:
![Code coverage with no assertions](/report-images/codecoverage_no_assertions.png)
### Report:
![Code coverage with no assertions](/report-images/test_noassertions_codecoverage.png)
