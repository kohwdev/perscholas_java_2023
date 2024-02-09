package module303;

public class PersonRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Woon", 10, 5);
        Student student2 = new Student("Bob", 11, 6);

        Teacher teacher1 = new Teacher("Mr.Smith", 35, "Math");
        Teacher teacher2 = new Teacher("Mrs.Johnson", 40, "English");

        School school = new School();

        school.addPerson(student1);
        school.addPerson(student2);
        school.addPerson(teacher1);
        school.addPerson(teacher2);

        school.printSchoolDetails();

    }
}
