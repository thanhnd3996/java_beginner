package exercise2;

import java.util.ArrayList;

public class Doctor {
    private String name;
    public ArrayList<Person> patients = new ArrayList<Person>();
    public ArrayList<Prescription> prescriptions = new ArrayList<Prescription>();

    public Doctor(String name, ArrayList<Person> patients) {
        this.name = name;
        this.patients = patients;
    }

    public Doctor() {
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public Prescription medicalExamination(Person person) {

        Prescription prescription = new Prescription();
        prescription.setId(100);
        prescription.setPatientName(person.getName());
        Medicine medicine1 = new Medicine();
        Medicine medicine2 = new Medicine();
        prescription.medicines.add(medicine1);
        prescription.medicines.add(medicine2);
        this.prescriptions.add(prescription);
        return prescription;

    }

}
