package exercise2;

import java.util.ArrayList;

public class Person {
    private String name;
    private boolean isSick;
    private boolean isAbsent;
    public ArrayList<HomeWork> homeWorks = new ArrayList<HomeWork>();
    public ArrayList<Medicine> medicines = new ArrayList<Medicine>();

    public Person(
            String name,
            boolean isSick,
            boolean isAbsent,
            ArrayList<HomeWork> homeWorks,
            ArrayList<Medicine> medicines) {
        this.name = name;
        this.isSick = isSick;
        this.isAbsent = isAbsent;
        this.homeWorks = homeWorks;
        this.medicines = medicines;
    }

    public Person() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setIsSick(boolean isSick) {
        this.isSick = isSick;
    }

    public boolean getIsSick() {
        return this.isSick;
    }

    public void setIsAbsent(boolean isAbsent) {
        this.isAbsent = isAbsent;
    }

    public boolean getIsAbsent() {
        return this.isAbsent;
    }

    public void takePrescription(Prescription prescription) {
        for (int i = 0; i < prescription.medicines.size(); i++) {
            Medicine medicine = prescription.medicines.get(i);
            this.medicines.add(medicine);
        }
        this.setIsSick(false);
    }

    public void doHomeWork(Lesson lesson) {
        for (int i = 0; i < lesson.homeWorks.size(); i++) {
            HomeWork homeWork = lesson.homeWorks.get(i);
            this.homeWorks.add(homeWork);
        }
    }

}