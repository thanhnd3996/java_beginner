public class JavaVariables {
    int age = 21;

    public static void main(String[] args) throws Exception {
        int age = 26;
        System.out.println("i am " + age + "years old");

        age = 26 + 1;
        System.out.println("next year i am  " + age + "years old");

        JavaVariables object = new JavaVariables();
        object.showAge();

    }

    public void showAge() throws Exception {
        System.out.println("And my younger sister is " + age + " years old");
    }
}
