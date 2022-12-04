import exercise2.Doctor;
import exercise2.Hospital;
import exercise2.JavaClass;
import exercise2.Lesson;
import exercise2.Person;
import exercise2.Prescription;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        // Init students
        Person thanh = new Person();
        Person ha = new Person();
        Person thu = new Person();
        Person dat = new Person();
        Person hoai = new Person();
        thanh.setName("Nguyen Duy Thanh");
        ha.setName("Nguyen Thi Ha");
        thu.setName("Nguyen Thi Hoai Thu");
        dat.setName("Nguyen Duc Dat");
        hoai.setName("Tran Thi Thu Hoai");

        // Them cac hoc sinh vao lop Java

        JavaClass javaClass = new JavaClass();
        javaClass.members.add(thanh);
        javaClass.members.add(ha);
        javaClass.members.add(thu);
        javaClass.members.add(dat);
        javaClass.members.add(hoai);

        // Them buoi hoc ngay hom qua 28/11 vao lop java
        Lesson yesterdayLesson = new Lesson();
        yesterdayLesson.setDate("28-Nov-2022");
        yesterdayLesson.joinMembers = javaClass.members;

        // Hoai set sick
        hoai.setIsSick(true);
        // set Hoai isAbsent
        hoai.setIsAbsent(true);
        // lesson update Hoai is absent
        yesterdayLesson.absentFromLesson(hoai);

        // Hoai di kham o hospital, hospital co doctor
        Hospital hospital = new Hospital();
        Doctor doctor = new Doctor();
        hospital.doctors.add(doctor);
        hospital.patients.add(hoai);

        // doctor kham cho Hoai
        Prescription prescription = doctor.medicalExamination(hoai);

        // Hoai take prescription
        hoai.takePrescription(prescription);
        if (hoai.getIsSick() == false) {
            hoai.doHomeWork(yesterdayLesson);
        }
        yesterdayLesson.listStudentInLesson();
    }

}
