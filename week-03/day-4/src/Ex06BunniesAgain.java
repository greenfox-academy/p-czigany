/**
 * Created by peter on 2017.03.30..
 */
public class Ex06BunniesAgain {

  public static void main(String[] args) {
    System.out.println(oddBunnyEarCounter(5));
  }

  private static int oddBunnyEarCounter(int numberOfBunnies) {
    int bunnies = numberOfBunnies;
    if (bunnies < 1) {
      return 0;
    } else {
      if (bunnies % 2 != 0) {
        return 2 + oddBunnyEarCounter(--bunnies);
      } else {
        return 3 + oddBunnyEarCounter(--bunnies);
      }
    }
  }
}
