import java.util.Scanner;

public class JavaUserInput {
    public static void main(String[] args) throws Exception {
        JavaUserInput.scannerInput1();
    }

    public static void scannerInput1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();

        System.out.print("how old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Sr. Can you say again? ");
        int age2 = Integer.parseInt(scanner.nextLine());

        System.out.print("What is your favorite language? ");
        String language = scanner.nextLine();

        String.format("\nOh! Hello %s %s", name, name);

        System.out.printf("\nOh! Hello %s ", name);
        System.out.printf("_______");
        System.out.printf("`n You are %s. %s is so young. Let's learn %s together.`\n", age, age2, language);
        scanner.close();

    }
}
