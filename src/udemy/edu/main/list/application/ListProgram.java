package udemy.edu.main.list.application;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates basic operations with List in Java
 */
public class ListProgram {

  // Prints the elements of a list with a header message
  private static void printList(List<String> list, String message) {
    System.out.println("----------Print List-----------");
    System.out.printf("-------------%s---------------\n", message);
    for (String x : list) {
      System.out.println(x);
    }
    System.out.println("-----------------------------");
  }

  // Finds and prints the position of an element in the list
  private static void printPosition(List<String> list, String param) {
    // Returns -1 if the element is not found
    Integer pos = list.indexOf(param);
    // Converts to base 1 for display
    String printPos = pos < 0 ? "Not found" : String.valueOf(pos + 1);
    System.out.printf("Position of %s : %s \n", param, printPos);
  }

  // Finds the first element that starts with the same letter as the parameter
  private static void printFirst(List<String> list, String param) {
    // Uses Stream API to filter and find the first element
    String name = list.stream()
        .filter(x -> x.charAt(0) == param.charAt(0))
        .findFirst()
        .orElse(null);

    if (name != null) {
      System.out.println("First: " + name + "\n");
    } else {
      System.out.println("First: Not found\n");
    }
  }

  public static void main(String[] args) {
    // Creates a list of strings
    List<String> list = new ArrayList<>();
    
    // Adds elements to the list
    list.add("Maria");
    list.add("Alex");
    list.add("Bob");
    list.add("Ana");
    list.add("Jill");
    list.add("Jenny");
 
    // Displays the list size
    System.out.println("List Size: " + list.size());

    // Prints the initial list
    printList(list, "Initial List");
    
    // Adds an element at position 0
    list.add(0, "Luke");

    // Removes elements that start with 'J' or 'A'
    list.removeIf(x -> x.charAt(0) == 'J' || x.charAt(0) == 'A');

    // Prints the list after modifications
    printList(list, "Modified List");
    
    // Searches for positions of specific elements
    printPosition(list, "Bob");
    printPosition(list, "Luke");
    printPosition(list, "Maria");
    printPosition(list, "Ana");

    // Adds elements at specific positions
    list.add(2, "Alex");
    list.add("Ana");

    // Filters elements that start with 'A' or 'B' using Stream API
    List<String> result = list.stream()
        .filter(x -> x.charAt(0) == 'A' || x.charAt(0) == 'B')
        .collect(Collectors.toList());

    printList(result, "Result List");

    System.out.println("-----First Result-----");
    // Tests the search for the first element that starts with a specific letter
    printFirst(list, "A");
    printFirst(list, "L");
    printFirst(list, "J");
    printFirst(list, "X");
    System.out.println("---------------------");
  }
}
