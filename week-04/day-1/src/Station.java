/**
 * Created by peter on 2017.04.03..
 */
public class Station {
  private int gasAmount;

  public void refill(Car car) {
    car.gasAmount++;
    gasAmount--;
  }

}