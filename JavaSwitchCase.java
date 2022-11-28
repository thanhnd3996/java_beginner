import java.util.Scanner;

public class JavaSwitchCase {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        JavaSwitchCase.switchCase1();
    }

    public static void switchCase1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Choose operation: ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
                break;
            case "div":
                if (number2 == 0) {
                    System.out.println("Can not divide by zero");
                } else {
                    System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
                }
                break;
            default:
                System.out.printf("s is not supported operation.", operation);
                break;
        }

        System.out.println();

        scanner.close();
    }
}
