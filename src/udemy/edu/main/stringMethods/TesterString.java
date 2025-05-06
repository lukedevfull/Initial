package udemy.edu.main.stringMethods;

public class TesterString {

  public static void main(String[] args) {
    String original = "abcde, FGHIJ, ABC, abc, DEFG, 12345";
    // Retorna a string original
    System.out.println(original + "\n");
    // Retorna a string em letras minúsculas
    String s1 = original.toLowerCase();
    System.out.println(s1 + "\n");
    // Retorna a string em letras maiúsculas
    String s2 = original.toUpperCase();
    System.out.println(s2 + "\n");
    // Retorna a string sem espaços em branco
    String s3 = original.trim();
    System.out.println(s3 + "\n");
    // Retorna outra string que começa no índice 6 e vai até o final
    String s4 = original.substring(6);
    System.out.println(s4 + "\n");
    // Altera a S4 para que começe no índice 2 e vai até o índice 9
    s4 = original.substring(2, 9);
    System.out.println(s4 + "\n");
    // troca a por x e retorna a string
    String s5 = original.replace('a', 'x');
    System.out.println(s5 + "\n");
    // troca abc por xyz e retorna a string
    String s6 = original.replace("abc", "xyz");
    System.out.println(s6 + "\n");
    // Retorna o índice da primeira ocorrência de abc
    int i = original.indexOf("DEFG");
    System.out.println(i + "\n");
    // Retorna o índice da última ocorrência de abc
    int j = original.lastIndexOf("abc");
    System.out.println(j + "\n");

    // split
    System.out.println("------SPLIT------");
    String s = "potato, apple, lemon";
    String[] vect = s.split(", ");
    System.out.println(vect[0]);
    System.out.println(vect[1]);
    System.out.println(vect[2]);
  }
}
