import java.util.Scanner;

/**
 * Created by peter on 2017.03.21..
 */
public class Ex31DrawDiagonal {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    for (int i = 0; i < a; i++) {
      for (int j = 0; j < a; j++) {
        if (i == 0 || j == 0 || i == a - 1 || j == a - 1 || i == j) {
          System.out.print("%");
        } else {
          System.out.print(" ");
        }
        if ((j + 1) == a) {
          System.out.print("\n");
        }
      }
    }
  }
}
