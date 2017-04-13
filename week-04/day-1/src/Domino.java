import java.util.Arrays;

/**
 * Created by peter on 2017.04.03..
 */
public class Domino {
  private final int[] values;

  Domino(int valueA, int valueB) {
    this.values = new int[]{valueA, valueB};
  }

  int[] getValues() {
    return values;
  }

  @Override
  public String toString() {
    return "[" + values[0] + ", " + values[1] + "]";
  }
}
