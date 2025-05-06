package udemy.edu.main.bitwise;

import java.util.Scanner;

public class Bit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int maksBin = 0b100000;
    int n2 = sc.nextInt();

    // Verify
    if ((n2 & maksBin) != 0) {
      System.out.println("6th bit is true!");
    } else {
      System.out.println("6th bit is false!");
    }
    sc.close();

  }
}
