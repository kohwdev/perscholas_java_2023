package module303.abstraction;

import java.util.Arrays;

public class AbstractRunner {
    public static void main (String [] args) {
        /*
        We create an object of type StudentService and that is what I meant when I said cannot be
        EXACTLY instantiated
         */
        //AbstractStudent myStudent = new AbstractStudent();
        AbstractStudent student = new StudentService();
        student.setUsername("Mike123");
        student.setPassword("password1234567");
        student.setRollnumber(0024);
        student.displayinformation();
        String[] name = {"Mike", "Gabriel"};
        System.out.println(Arrays.toString(student.getFullName(name)));
        StudentService st = new StudentService();
        st.getCourseName();
        st.getInstructor();
        st.getIAName();
        st.getProgramDuration();
    }

}
