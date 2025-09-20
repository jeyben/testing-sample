package com.eybenconsult.testing.sample;

public class LogicService {

  /**
   * Represents the program logic that we highly rely on in a critical application.
   * It is intended to add numbers, but leave out numbers below 1000.
   */
  public long addLarge(int a, int b, int c) {
    int result = 0;
    if (a >= 1000) {
      result += a;
    }
    if (b == 1000) { // programmer typo: using == instead of >=, Oops ;-(
      result += b;
    }
    if (c >= 1000) {
      result += c;
    }
    return result;
   }
}
