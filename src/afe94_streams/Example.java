package afe94_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Example {
  public static String reverse(String s) {
    String newStr = "";

    for(int i = s.length(); i > 0; i--) {
      newStr += s.substring(i - 1, i);
    }

    return newStr;
  }

  public static List<String> reverseString(List<String> input) {
    return input
        .stream()
        .map(Example::reverse)
        .collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigits(List<String> input) {
    return input
        .stream()
        .filter(s -> {
          String fstChar = s.substring(0, 1);
          try {
            Integer.parseInt(fstChar);
            return true;
          } catch(NumberFormatException e) {
            return false;
          }
        })
        .map(s -> {
          String fstChar = s.substring(0, 1);
          return Integer.parseInt(fstChar);
        })
        .map(n -> Math.sqrt((double) n))
        .collect(Collectors.toList());
  }

  public static List<Double> sqrtsOfFirstDigitsMonolithic(List<String> input) {
    return input
        .stream()
        .filter(s -> {
          String fstChar = s.substring(0, 1);
          try {
            Integer.parseInt(fstChar);
            return true;
          } catch(NumberFormatException e) {
            return false;
          }
        })
        .map(s -> {
          String fstChar = s.substring(0, 1);
          return Math.sqrt((double) Integer.parseInt(fstChar));
        })
        .collect(Collectors.toList());
  }

  public static void main(String[] args) {
    // Reversing a list of strings
    List<String> sentence = List.of("The", "quick", "brown", "fox");
    List<String> reversed = reverseString(sentence);

    System.out.println(Arrays.toString(reversed.toArray()));

    // Square roots of first digits
    List<String> stringList = List.of("The", "3quick", "4brown", "5fox");
    List<Double> sqrtsList = sqrtsOfFirstDigitsMonolithic(stringList);
    System.out.println(Arrays.toString(sqrtsList.toArray()));
  }
}
