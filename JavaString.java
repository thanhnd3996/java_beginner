public class JavaString {
    public static void main(String[] args0) {
        // JavaString.string1();
        // JavaString.string2();
        // JavaString.string3();
        JavaString.string4();
    }

    public static void string1() {
        char percentSign = '%';
        System.out.println(percentSign);

        String name = "thanhnd";
        System.out.println(name);

        String newObj = new String("thanhnd2");
        System.out.println(newObj);
    }

    public static void string2() {
        String literalString1 = "abc";
        String literalString2 = "abc";

        String objectString1 = new String("abc");
        String objectString2 = new String("abc");

        System.out.println(literalString1 == literalString2);

        System.out.println(literalString1 == objectString1);
        System.out.println(objectString1 == objectString2);

    }

    public static void string3() {
        String name = "Thanh";
        int age = 26;
        boolean isHandsome = true;
        int booleanInt = 1;

        String concatString = "hello betu team, i am " + name + ". I am " + age + " years old.";
        System.out.println(concatString);

        String formattedString1 = String.format("Hello betu team. I am %s. I am %d years old. And %b with %d", name,
                age, isHandsome, booleanInt);
        System.out.println(formattedString1);

        String formattedString2 = String.format("Hello betu team. I am %s. I am %d years old. And %b with %b", name,
                age, isHandsome, booleanInt);
        System.out.println(formattedString2);

        System.out.println(1 + ' ');

    }

    public static void string4() {
        String name = "My name is Thanh";

        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String objectString1 = new String("abc");
        String objectString2 = new String("abc");
        String objectString3 = new String("ABC");

        System.out.println(objectString1 == objectString2);
        System.out.println(objectString1.equals(objectString2));
        System.out.println(objectString1.equalsIgnoreCase(objectString3));

    }
}
