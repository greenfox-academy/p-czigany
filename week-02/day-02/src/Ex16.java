/**
 * Created by peter on 2017.03.21..
 */

import java.util.Scanner;

public class Ex16 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("How many chickens does the farmer has?");
    int chicks = scan.nextInt();
    System.out.println("How many pigs does she have?");
    int pigs = scan.nextInt();
    System.out.println("These healthy farm animals have " + (chicks * 2 + pigs * 4) + " legs total.");
  }
}
