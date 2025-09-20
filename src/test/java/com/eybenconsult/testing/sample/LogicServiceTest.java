package com.eybenconsult.testing.sample;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class LogicServiceTest {
  LogicService logic;

  @BeforeEach
  void setUp() {
    logic = new LogicService();
  }

  /**
   * Will provide 100% line coverage, but without an assertion this is completely false security.
   */
  @Test
  void testAdd_NoAssertions() {
    logic.addLarge(2000, 1000, 1000);
    logic.addLarge(1, 1, 1);
  }

  /**
   * Will provide 100% line coverage, but not 100% mutation coverage, as mutations around the if statements will
   * still let the test survive.
   */
  @Test
  @Disabled
  void testAdd_Assertions_1() {
    Assertions.assertEquals(4000, logic.addLarge(2000, 1000, 1000));
    Assertions.assertEquals(0, logic.addLarge(1, 1, 1));
  }

  /**
   * Will provide 100% line coverage, and 100% mutation coverage, but still lack the assertion that shows
   * the implementation error around b == 1000 in the logic service.
   */
  @Test
  @Disabled
  void testAdd_Assertions_2() {
    Assertions.assertEquals(3000, logic.addLarge(1000, 1000, 1000));
  }

  /**
   * Will fail as it detects the implementation error around b == 1000 in the logic service.
   */
  @Test
  @Disabled
  void testAdd_Assertions_3() {
    Assertions.assertEquals(3003, logic.addLarge(1001, 1001, 1001));
  }

  /**
   * Will fail as it hits the max int boundary.
   * A case that is not caught by measuring line coverage or by mutation testing.
   */
  @Test
  @Disabled
  void testAdd_Assertions_4() {
    Assertions.assertEquals(3_000_000_000L, logic.addLarge(1_000_000_000, 1_000_000_000, 1_000_000_000));
  }
}
