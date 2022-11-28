import java.util.Arrays;

public class JavaArray {
    public static void main(String[] args) throws Exception {
        System.out.println("\n");
        // JavaArray.array1();
        // JavaArray.array2();
        JavaArray.array3();
    }

    public static void array1() {
        char vowels[] = new char[5];

        vowels[4] = 'u';
        vowels[0] = 'a';
        vowels[3] = 'o';
        vowels[1] = 'e';
        vowels[2] = 'i';

        System.out.println(vowels);
        System.out.println(Arrays.toString(vowels));

    }

    public static void array2() {
        char vowels[] = { 'u', 'e', 'o', 'a', 'i' };
        System.out.println(Arrays.toString(vowels));

        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        vowels[2] = 'x';
        System.out.println(Arrays.toString(vowels));

        char key = 'x';
        int foundItemIndex = Arrays.binarySearch(vowels, key);
        System.out.println(foundItemIndex);
    }

    public static void array3() {
        int numbers[] = { 1, 2, 3, 4, 5 };
        int copyOfNumbers[] = numbers;
        int cloneOfNumbers[] = Arrays.copyOf(numbers, 2);
        int cloneOfNumbers2[] = Arrays.copyOf(cloneOfNumbers, 2);

        int startingIndex = 1;
        int endingIndex = 4;
        int cloneOfNumbersRange[] = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

        Arrays.fill(numbers, 0);
        System.out.println(Arrays.toString(cloneOfNumbersRange));

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));
        System.out.println(numbers == copyOfNumbers);

        System.out.println(Arrays.toString(cloneOfNumbers));
        System.out.println(Arrays.toString(cloneOfNumbers2));
        System.out.println(cloneOfNumbers2 == cloneOfNumbers);
    }
}