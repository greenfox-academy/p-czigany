/**
 * Created by peter on 2017.03.21..
 */
public class Ex32FizzBuzz {

  public static void main(String[] args) {
    for (int i = 1; i < 101; i++) {
      if (i % 3 != 0 && i % 5 != 0) {
        System.out.println(i);
      } else {
        if (i % 3 == 0) {
          System.out.print("Fizz");
        }
        if (i % 5 == 0) {
          System.out.print("Buzz");
        }
        System.out.print("\n");
      }
    }
  }
}
