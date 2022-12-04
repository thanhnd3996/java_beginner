public class JavaForLoop {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        // JavaForLoop.forLoopExample1();
        // JavaForLoop.forLoopExample2();
        // JavaForLoop.forLoopExample3();
        // JavaForLoop.forLoopExample4();
        // JavaForLoop.forLoopExample5();
        JavaForLoop.forLoopExample6();
    }

    public static void forLoopExample1() {
        for (int number = 0; number <= 10; number++) {
            System.out.printf("%d", number);
        }
        System.out.println();
    }

    public static void forLoopExample2() {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;

        for (int index = 0; index < numbers.length; index++) {
            System.out.printf("%d ", numbers[index]);
            sum += numbers[index];

            System.out.println();
            System.out.println(sum);
        }
    }

    public static void forLoopExample3() {
        int number = 5;
        for (int multiplier = 0; multiplier <= 10; multiplier++) {
            System.out.printf("%dx%d=%d; ", number, multiplier, number * multiplier);
        }

        System.out.println(number);
    }

    public static void forLoopExample4() {
        for (int number = 0; number <= 10; number++) {
            for (int multiplier = 0; multiplier <= 10; multiplier++) {
                System.out.printf("%dx%d=%d; ", number, multiplier, number * multiplier);
            }
        }
        System.out.println();
    }

    public static void forLoopExample5() {
        for (int number = 0; number <= 50; number++) {
            if (number % 2 == 1) {
                System.out.printf("%d, ", number);
            }
        }
        System.out.println();
    }

    public static void forLoopExample6() {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int sum = 0;
        for (int number : numbers) {
            System.out.printf("%d", number);
            sum += number;
        }
        System.out.println();
        System.out.println(sum);
    }
}