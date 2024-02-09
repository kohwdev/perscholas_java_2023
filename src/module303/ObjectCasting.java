package module303;

import module303.object_example.MatriculatedStudent;
import module303.object_example.Student;

public class ObjectCasting {

    public static void main(String[] args) {
        //Upcasting
        Student student = new MatriculatedStudent();
        //Downcasting
        MatriculatedStudent matriculatedStudent = (MatriculatedStudent) new Student();
    }
}
