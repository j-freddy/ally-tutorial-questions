package a98e3_1421421;

import java.util.Scanner;

class CollatzConjecture {
  static int next(int x) {
    if(x % 2 == 0) {
      //Even
      return x / 2;
    } else {
      //Odd
      return 3 * x + 1;
    }
  }

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int input = Integer.parseInt(scanner.next());
    int output = input;

    do {
      System.out.print(output + " ");
      output = next(output);
    } while(output != 1);

    System.out.print(output);
  }
}
