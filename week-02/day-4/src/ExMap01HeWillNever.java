import java.util.HashMap;
import java.util.Map;

/**
 * Created by peter on 2017.03.23..
 */
public class ExMap01HeWillNever {

  public static void main(String... args) {
    String out = "";
    int[] notSoCrypticMessage = {1, 12, 1, 2, 11, 1, 7, 11, 1, 49, 1, 3, 11, 1, 50, 11};

    Map<Integer, String> hmap = new HashMap<>();

    hmap.put(7, "run around and desert you");
    hmap.put(50, "tell a lie and hurt you");
    hmap.put(49, "make you cry,");
    hmap.put(2, "let you down");
    hmap.put(12, "give you up,");
    hmap.put(1, "Never gonna");
    hmap.put(11, "\n");
    hmap.put(3, "say goodbye");

    for (int i = 0; i < notSoCrypticMessage.length; i++) {
      out += hmap.get(notSoCrypticMessage[i]);
      if (hmap.get(notSoCrypticMessage[i]) != "\n") {
        out += " ";
      }
    }
    System.out.println(out);
  }
}
