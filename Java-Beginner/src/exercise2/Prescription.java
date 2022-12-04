package exercise2;

import java.util.ArrayList;

public class Prescription {
    private int id;
    private String patientName;
    public ArrayList<Medicine> medicines = new ArrayList<Medicine>();
    public Doctor doctor;

    public Prescription(int id, String patientName, ArrayList<Medicine> medicines, Doctor doctor) {
        this.id = id;
        this.patientName = patientName;
        this.medicines = medicines;
        this.doctor = doctor;
    }

    public Prescription() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setPatientName(String name) {
        this.patientName = name;
    }

    public String getPatientName() {
        return this.patientName;
    }
}
