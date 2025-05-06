package udemy.edu.main.exercises.matrizes;

import java.util.Locale;
import java.util.Scanner;

import udemy.edu.main.exercises.matrizes.entities.Product;

public class MatrizeApplication {

  public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número de produtos: ");
    Product[] productVect = new Product[sc.nextInt()];

    for (int i = 0; i < productVect.length; i++) {
      sc.nextLine(); // cleaner buffer
      System.out.println("Digite o nome do produto: ");
      String name = sc.nextLine();
      System.out.println("Digite o preço do produto: ");
      double price = sc.nextDouble();

      productVect[i] = new Product(name, price);
    }

    System.out.println("Lista de produtos: \n");

    for (int i = 0; i < productVect.length; i++ ){
      System.out.println("Nome: " + productVect[i].getName() + "\n" + "Preço: " + productVect[i].getPrice() + "\n");
    }

    double sum = 0;
    for (int i = 0; i < productVect.length; i++) {
      sum += productVect[i].getPrice();
    }

    System.out.println("Preço total: " + sum + "\n");
    System.out.printf("Média dos preços: %.2f\n", sum / productVect.length);
    
    sc.close();
  }
}