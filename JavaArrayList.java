import java.util.ArrayList;
import java.util.Comparator;

public class JavaArrayList {
  public static void main(String[] args) {
    JavaArrayList.ArrayList1();

  }

  public static void ArrayList1() {
    ArrayList<Integer> number1 = new ArrayList<Integer>();

    number1.add(100);
    number1.add(5);
    number1.add(10);
    number1.remove(2);
    System.out.println("size: " + number1.size());
    System.out.println("number1: " + number1);
    System.out.println(number1.toString());
    System.out.println(number1.get(1));
    number1.sort(Comparator.naturalOrder());
    System.out.println(number1);

    for (int i = 0; i < number1.size(); i++) {
      System.out.println(number1.get(i));
    }

    System.out.println("===============");

    number1.forEach(number -> {
      number1.set(number1.indexOf(number), number * 2);
    });
    System.out.println(number1);
  }
}
