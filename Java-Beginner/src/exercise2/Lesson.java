package exercise2;

import java.util.ArrayList;

public class Lesson {
    private String date;
    private String content;
    public ArrayList<HomeWork> homeWorks = new ArrayList<HomeWork>();
    public ArrayList<Person> joinMembers = new ArrayList<Person>();

    public Lesson(String date, String content, ArrayList<HomeWork> homeWorks, ArrayList<Person> joinMembers) {
        this.date = date;
        this.content = content;
        this.homeWorks = homeWorks;
        this.joinMembers = joinMembers;
    }

    public Lesson() {

    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDate() {
        return this.date;
    }

    public String getContent() {
        return this.content;
    }

    public void absentFromLesson(Person person) {
        if (person.getIsSick()) {
            this.joinMembers.remove(person);
        }
    }

    public void listStudentInLesson() {
        System.out.println("Students joined lesson " + this.getDate() + " :");

        for (int i = 0; i < this.joinMembers.size(); i++) {
            Person student = this.joinMembers.get(i);
            System.out.println(i + 1 + ". " + student.getName());
        }
    }

}
