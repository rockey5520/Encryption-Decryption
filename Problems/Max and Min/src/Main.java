import java.util.Scanner;

class Finder {

  private FindingStrategy strategy;

  public Finder(FindingStrategy strategy) {
    this.strategy = strategy;
  }

  /**
   * It performs the search algorithm according to the given strategy
   */
  public int find(int[] numbers) {
    int result;

    if (numbers.length > 0) {
      result = numbers[0];

      for (int i = 1; i < numbers.length; i++) {
        result = strategy.takeOne(result, numbers[i]);
      }

    } else {
      return strategy.getDefaultValue();
    }

    return result;
  }
}

interface FindingStrategy {

  /**
   * Returns one of two values
   */
  int takeOne(int elem1, int elem2);

  /**
   * Returns the default value of a concrete implementation
   */
  int getDefaultValue();
}

class MaxFindingStrategy implements FindingStrategy {

  public int takeOne(int elem1, int elem2) {
    if (elem1 < elem2) {
      elem1 = elem2;
    }
    return elem1;
  }

  public int getDefaultValue() {
    return Integer.MIN_VALUE;
  }
}

class MinFindingStrategy implements FindingStrategy {

  public int takeOne(int elem1, int elem2) {
    if (elem1 > elem2) {
      elem1 = elem2;
    }
    return elem1;
  }

  public int getDefaultValue() {
    return Integer.MAX_VALUE;
  }
}

/* Do not change code below */
public class Main {

  public static void main(String[] args) {

    final Scanner scanner = new Scanner(System.in);

    final String[] elements = scanner.nextLine().split("\\s+");
    int[] numbers;

    if (!elements[0].equals("EMPTY")) {
      numbers = new int[elements.length];
      for (int i = 0; i < elements.length; i++) {
        numbers[i] = Integer.parseInt(elements[i]);
      }
    } else {
      numbers = new int[0];
    }

    final String type = scanner.nextLine();

    Finder finder = null;

    switch (type) {
      case "MIN":
        finder = new Finder(new MinFindingStrategy());
        break;
      case "MAX":
        finder = new Finder(new MaxFindingStrategy());
        break;
      default:
        break;
    }

    if (finder == null) {
      throw new RuntimeException(
          "Unknown strategy type passed. Please, write to the author of the problem.");
    }

    System.out.println(finder.find(numbers));
  }
}