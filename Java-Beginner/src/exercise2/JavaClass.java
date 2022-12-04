package exercise2;

import java.util.ArrayList;

public class JavaClass {
    public ArrayList<Lesson> lessons = new ArrayList<Lesson>();
    public ArrayList<Person> members = new ArrayList<Person>();

    public JavaClass(ArrayList<Lesson> lessons, ArrayList<Person> members) {
        this.lessons = lessons;
        this.members = members;
    }

    public JavaClass() {
    }
}
