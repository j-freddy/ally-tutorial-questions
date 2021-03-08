package a4c70_lottery_numbers;

import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
  public static void main(String[] args) {
    Random random = new Random();
    final int MAX_NO = 49;
    final int DRAW_COUNT = 7;
    final int BONUS_ID = 7;

    ArrayList<Integer> numbers = new ArrayList<>();
    for(int i = 1; i <= MAX_NO; i++) {
      numbers.add(i);
    }

    //Draw
    for(int i = 1; i <= DRAW_COUNT; i++) {
      int no = numbers.remove(random.nextInt(numbers.size()));

      if(i == BONUS_ID) {
        System.out.println("Bonus Number: " + no);
      } else {
        System.out.println("Number " + i + ": " + no);
      }
    }

  }
}
