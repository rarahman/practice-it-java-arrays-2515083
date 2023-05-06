import java.util.Arrays;

public class App {

  public static void main(String[] args) {
    double[] lotteryNums = { 45, 92, 38, 33, 21 }; // new double[5];
    // For loop
    for (int i = 0; i < lotteryNums.length; i++) {
      System.out.println(lotteryNums[i]);
    }
    System.out.println();

    // Iterate backwards through the array.
    for (int i = lotteryNums.length - 1; i >= 0; i--) {
      System.out.println(lotteryNums[i]);
    }
    System.out.println();

    // Decrement i by 2.
    for (int i = lotteryNums.length - 1; i >= 0; i -= 2) {
      System.out.println(lotteryNums[i]);
    }
    System.out.println();

    // For each loop
    System.out.println("Printing out contents or array with a 'For Each' loop: \n");

    for (double d : lotteryNums) {
      System.out.println(d);
    }

    System.out.println();

    // Java Streams
    System.out.println("Printing out contents of an array with Java Steams: \n");

    Arrays.stream(lotteryNums).forEach(System.out::println);
    // Arrays.stream(lotteryNums).filter()
    // Arrays.stream(lotteryNums).average()
    // Arrays.stream(lotteryNums).sum()

  }
}
