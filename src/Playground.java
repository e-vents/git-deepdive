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
    System.out.print("OP-0004 change"); // correct state
  }

}
