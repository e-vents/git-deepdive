public class Playground {

  public static void main(String[] args) {
    int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int value : numbers) {
      System.out.print(value + " ");
    }

    firstMethod();
    firstMethod(); // again
    firstMethod(); // okay, lets do it
  }

  public static void firstMethod() {
    // completely new implemented by OP-0003
    System.out.print("OP-0004 change"); // correct state
  }

  public static void methodOfThree() {
    // merging conflicts? no problem!
  }

  public static void methodOfFour() {
    // finally, understood rebasing
  }
}
