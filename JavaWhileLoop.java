public class JavaWhileLoop {
  public static void main(String[] args) {
    JavaWhileLoop.WhileLoopExample1();
  }

  public static void WhileLoopExample1() {
    int number = 0;
    while (number <= 10) {
      System.out.printf("%d", number);
      number++;
    }
    System.out.println("End!!!");
  }

  public static void WhileLoopExample2() {
    int number2 = 11;
    do {
      System.out.printf("%d", number2);
      number2++;
    } while (number2 <= 10);
  }

}
