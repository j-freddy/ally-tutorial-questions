package af79b_perfect_palindromic_cubes;

import java.util.Stack;

class PerfectPalindromicCubes {
  static String reverseString(String str) {
    Stack<Character> stack = new Stack<>();
    char[] str2 = str.toCharArray();

    //Push each character to stack
    for(char c : str2) {
      stack.push(c);
    }

    char[] reversedStr = new char[str2.length];
    int count = 0;
    //Pop each character from stack
    while(!stack.empty()) {
      reversedStr[count] = stack.pop();
      count++;
    }

    return String.valueOf(reversedStr);
  }

  //Even length no.
  static boolean isPalindromeEven(int x) {
    String num = String.valueOf(x);
    String fstHalf = num.substring(0, num.length() / 2);
    String sndHalf = num.substring(num.length() / 2);

    return fstHalf.equals(reverseString(sndHalf));
  }

  //Odd length no.
  static boolean isPalindromeOdd(int x) {
    String num = String.valueOf(x);
    String fstHalf = num.substring(0, (int) Math.floor(num.length() / 2.0));
    String sndHalf = num.substring((int) Math.ceil(num.length() / 2.0));

    return fstHalf.equals(reverseString(sndHalf));
  }

  static boolean isPalindrome(int x) {
    if(String.valueOf(x).length() % 2 == 0) {
      //Even length no.
      return isPalindromeEven(x);
    } else {
      //Odd length no.
      return isPalindromeOdd(x);
    }
  }

  static int cubed(int x) {
    return (int) Math.pow(x, 3);
  }

  public static void main(String[] args) {
    for(int i = 0; i < 1500; i++) {
      int cube = cubed(i);

      if(isPalindrome(cube)) {
        System.out.println(i + " cubed is " + cube);
      }
    }
  }
}
