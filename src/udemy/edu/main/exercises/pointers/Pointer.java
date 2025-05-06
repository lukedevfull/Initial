package udemy.edu.main.exercises.pointers;

import java.util.Locale;
import java.util.Scanner;

public class Pointer {
  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número de Alturas: ");
    int N = sc.nextInt();

    double[ ] heights = new double[N];

    for (int i = 0; i < N; i++) {
      System.out.println("Digite a altura: ");
      heights[i] = sc.nextDouble();
    }

    for (int i = 0; i < N; i++) {
      System.out.println("Height: " + heights[i] + "m");
    }

    sc.close();
  }
}
