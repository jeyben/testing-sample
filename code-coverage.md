# Code coverage
By running a test without a single assertion, we can still achieve 100% line coverage.
That leads to a very false sense of security.

What code coverage actually concludes is:
* That the code is running during test execution.

What it **doesn't** conclude is:
* That the code meets the business requirements.
* That the code is scalable.
* That the code is performant.
* That the code is maintainable.
* That the code is thread safe.
* That the code is memory safe.
* That the code is secure.
* That the code is fault tolerant.
* That the code is resilient.
* ...

### Example
This "test" will provide 100% line coverage of the LogicService:
``` java
/**
 * Will provide 100% line coverage, but without an assertion this is completely false security.
 */
@Test
void testAdd_NoAssertions() {
  logic.addLarge(2000, 1000, 1000);
  logic.addLarge(1, 1, 1);
}
```
### Report:
![Code coverage with no assertions](/report-images/test_noassertions_codecoverage.png)
