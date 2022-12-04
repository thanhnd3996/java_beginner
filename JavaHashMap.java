import java.util.HashMap;

public class JavaHashMap {
  public static void main(String[] args) {
    JavaHashMap.hasMapExample1();
  }

  public static void hasMapExample1() {
    HashMap<String, Integer> examScores = new HashMap<String, Integer>();
    examScores.put("Math", 100);
    examScores.put("English", 70);
    examScores.put("Informatics", 95);

    System.out.println(examScores.toString());
    System.out.println(examScores.get("Math"));

    examScores.putIfAbsent("Math", 1000); // put neu k ton tai
    examScores.replace("Math", 80);
    examScores.getOrDefault("English", 9);

    System.out.println(examScores);

    examScores.forEach((subject, score) -> {
      System.out.println(subject + "-" + score);
      examScores.replace(subject, score + 1);
    });

    System.out.println(examScores);
    examScores.clear();

  }
}
