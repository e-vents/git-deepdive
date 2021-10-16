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
    HelperClass helperClass = new HelperClass();
    helperClass.unusualChange();
    helperClass.unusualChangeSecond();
    System.out.print("first method");
    System.out.print("OP-0001 change");
    System.out.print("OP-0002 change"); //different
    System.out.print("OP-0001 change");
    System.out.print("OP-0002 change"); //different
  }

}
