public class JavaOperator {
    public static void main(String[] args) throws Exception {
        // JavaOperator.operator1();
        // JavaOperator.operator2();
        // JavaOperator.operator3();
        JavaOperator.operator4();
    }

    public static void operator1() {
        int number1 = 13;
        int number2 = 6;
        double number3 = number1;

        System.out.println(number1 + number2);
        System.out.println(number1 - number2);
        System.out.println(number1 * number2);
        System.out.println(number1 / number2);
        System.out.println(number3 / number2);
        System.out.println(number1 % number2);
    }

    public static void operator2() {
        int number = 14;
        number += 5;
        ++number;
        System.out.println(number);
        --number;
        System.out.println(number);
        System.out.println(number++);
        System.out.println(number--);
    }

    public static void operator3() {
        int number1 = 13;
        int number2 = 13;
        System.out.println(number1 == number2);
        System.out.println(number1 != number2);
        System.out.println(number1 > number2);
        System.out.println(number1 < number2);
        System.out.println(number1 >= number2);
        System.out.println(number1 <= number2);
    }

    public static void operator4() {
        int age = 13;
        System.out.println(age >= 18 && age <= 40);

        boolean isBetuStakeHolder = true;
        boolean isSotatekMember = false;
        System.out.println(isBetuStakeHolder || isSotatekMember);
        System.out.println(!isBetuStakeHolder);

    }
}
