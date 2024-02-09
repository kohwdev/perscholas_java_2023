package module303;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    String name;
    int age;

    //Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println(name);
        System.out.println(age);
    }
}

//Student Class that extends person
class Student extends Person {
    int grade;

    //constructor
    public Student(String name, int age, int grade) {
        super(name, age);
        this.grade= grade;
    }

    //Method to display details
    public void displayDetails() {
        super.displayDetails();
    }
}

class Teacher extends Person {
    String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void displayDetails() {
        super.displayDetails();
    }
}

//School class
class School {
    private ArrayList<Person> peopleList;

    public School() {
        this.peopleList = new ArrayList<>();
    }

    public void addPerson(Person person) {
        peopleList.add(person);
    }

    public void printSchoolDetails() {
        for (Person person : peopleList) {
            if (person instanceof Student) {
                System.out.println("Student details:");
            } else if (person instanceof Teacher) {
                System.out.println("Teacher details:");
            }

            person.displayDetails();
            System.out.println();
        }
    }

}



