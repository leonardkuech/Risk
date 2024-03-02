package com.riskyminions.objects.dice;

/**
 * This class represents a dice. You can roll it and get a random number between 1 and 6.
 *
 * @author lkuech
 */
public class Dice {

  /**
   * Rolls a die and returns a random number between 1 and 6.
   *
   * @return a random number in the intervall (1:6)
   * @author lkuech
   */
  public static int roll() {
    return (int) (Math.random() * 6 + 1);
  }
}
