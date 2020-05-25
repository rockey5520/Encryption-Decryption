import java.util.ArrayList;
import java.util.Collections;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String input = scanner.next();
    if (input.charAt(0) + input.charAt(1) + input.charAt(2) == input.charAt(3) + input.charAt(4)
        + input.charAt(5)) {
      System.out.println("Lucky");
    } else {
      System.out.println("Regular");
    }
  }
}