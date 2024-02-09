package module303.object_example;

public class MatriculatedStudent extends Student {
    /*
    If we do not create a constructor the JVM calls the no args constructor
     */

//    public MatriculatedStudent(String firstName, String middleName, String lastName, int age, long socialSecurityNo, String address, double[] grades, int graduationYear){
//        /*
//        automatically calls the parameterized constructor of the parent class using the super keyword
//         */
//        super(firstName, middleName, lastName, age, socialSecurityNo, address, grades, graduationYear);
//    }
    public void myMethod() {
        Student myStudent = new Student();
        //myStudent.schoolName = "Per Scholas";
        //myStudent.protectedDemo = 100;
        //super and this can be used interchangeably as well

    }

    /*
    Overriding means we have changed or replaced the logic of a parent class
    You can replace the logic but the method name, signature and (parameters) and return type remain the same
     */


}
