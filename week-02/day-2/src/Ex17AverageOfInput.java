import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex17AverageOfInput {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("I would like five pieces of integer:");
    int sum = 0;
    for (int i = 0; i < 5; i++) {
      sum += scan.nextInt();
    }
    System.out.println("Sum: " + sum + ", Average: " + (sum / (float) 5));
  }
}
