package module303.object_example;

import java.util.ArrayList;

public class StudentDriver {
    public static void main(String[] args) {
        //Create student objects/instances
        double grades[] = new double[]{100, 95, 99};
        Student woon = new Student("Woon", "John", "Koh", 19, 12345, "123 ABC Lane", grades, 2024);
        Student akira = new Student();
        akira.setName("Akira", "Lake", "Tran");
        akira.setGrades(grades);
        akira.setAddress("36 Cobblestone Park");
        akira.setSocialSecurityNo(333333);
        akira.setGraduationYear(2024);
        Student ted = new Student("First", "Mid", "Last");

        ArrayList<Student> students = new ArrayList<>();
        students.add(woon);
        students.add(akira);
        students.add(ted);

        for (Student s : students) {
            System.out.println(s.toString());
        }

        //students.add(new Student())


    }


}
