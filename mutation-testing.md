# Mutation testing
Works by introducing mutations to the production code, to see if any of the already writting testcases will detect the mutation, by failing the testcase.  
An unsuccessful mutation test, is when a mutation of the code isn't failing any testcase.

What mutation testing helps to conclude is:
* That the code is running during test execution.
* That testcases have assertions to the business requirements
* Good chance that unexpected changes to the code will be detected before it reaches production.

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

### Example 1
**code**  
``` java
/**
 * Will provide 100% line coverage, but without an assertion mutation coverage is 0%.
 */
@Test
void testAdd_NoAssertions() {
  logic.addLarge(2000, 1000, 1000);
  logic.addLarge(1, 1, 1);
}
```
**Report**  
![Mutation coverage with no assertions](/report-images/test_noassertions_mutation_coverage.png)

### Example 2
**code**  
This test will provide 100% line coverage, but show that nothing was detected during the mutation tests:
``` java
/**
 * Will provide 100% line coverage, but not 100% mutation coverage, as mutations around the if statements will
 * still let the test survive.
 */
@Test
void testAdd_Assertions_1() {
  Assertions.assertEquals(4000, logic.addLarge(2000, 1000, 1000));
  Assertions.assertEquals(0, logic.addLarge(1, 1, 1));
}
```
**Report**  
![Mutation coverage with incomplete assertions](/report-images/test_assertions_mutation_coverage_failing.png)

### Example 3
**code**  
This test will provide 100% line coverage, but show that nothing was detected during the mutation tests:
``` java
/**
 * Will provide 100% line coverage, and 100% mutation coverage, but still lack the assertion that shows
 * the implementation error around b == 1000 in the logic service.
 */
@Test
void testAdd_Assertions_2() {
  Assertions.assertEquals(3000, logic.addLarge(1000, 1000, 1000));
}
```
**Report**  
![Mutation coverage with false ok assertions](/report-images/test_assertions_mutation_coverage_ok.png)
