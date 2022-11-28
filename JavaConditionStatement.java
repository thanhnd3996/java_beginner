import java.util.Scanner;

public class JavaConditionStatement {
    public static void main(String[] args) throws Exception {
        JavaConditionStatement.conditionStatement1();
    }

    public static void conditionStatement1() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Choose operation: ");
        String operation = scanner.nextLine();

        if (operation.equals("sum")) {
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        } else if (operation.equals("sub")) {
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        } else if (operation.equals("mul")) {
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        } else if (operation.equals("div")) {
            if (number2 == 0) {
                System.out.println("Can not divide by zero");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        } else {
            System.out.printf("s is not supported operation.", operation);
        }

        System.out.println();

        scanner.close();

    }
}
