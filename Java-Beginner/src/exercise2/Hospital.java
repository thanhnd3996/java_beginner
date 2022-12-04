package exercise2;

import java.util.ArrayList;

public class Hospital {
    private String name;
    private String address;
    public ArrayList<Doctor> doctors = new ArrayList<Doctor>();
    public ArrayList<Person> patients = new ArrayList<Person>();

    public Hospital(ArrayList<Doctor> doctors, ArrayList<Person> patients) {
        this.doctors = doctors;
        this.patients = patients;
    }

    public Hospital() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }
}
