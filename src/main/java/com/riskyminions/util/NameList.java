package com.riskyminions.util;

import java.util.ArrayList;
import java.util.List;

public class NameList {

  // List of names from the Despicable Me movie

  public static final String[] names = {
      "Gru",
      "Lucy Wilde ",
      "Vector",
      "Margo",
      "Edith",
      "Agnes",
      "Dr. Nefario",
      "El Macho",
      "Dru",
      "Balthazar Bratt"
  };
  private static final List<Integer> counter = new ArrayList<>();

  /**
   * Returns a random name from the list of names. Each Name can only be returned once.
   *
   * @return a random name from the list of names
   * @author hneumann
   */
  public static String getRandomName() {
    int index = (int) (Math.random() * names.length);
    while (counter.contains(index)) {
      index = (int) (Math.random() * names.length);
    }
    counter.add(index);
    return names[index];
  }
}
