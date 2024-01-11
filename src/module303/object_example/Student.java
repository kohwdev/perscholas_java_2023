package module303.object_example;

public class Student {
    //Attributes/Field: variables that hold things about the student
    private String firstName;
    private String middleName;
    private String lastName;
    private int age;
    private long socialSecurityNo;
    private String address;
    private double[] grades;
    private int graduationYear;

    //Default attribute
    String schoolName;

    //Constructor - special method that we use when we create Student objects
    //Same name as the Class
    public Student(String firstName, String middleName, String lastName, int age, long socialSecurityNo, String address, double[] grades, int graduationYear) {
        //Take the attributes of the class and make them equal to those are put into the parentheses
        //Also use 'this' keyword to differentiate between the attributes at the top and those in parentheses
        this.firstName = firstName; //assign arguments to fields of the object
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.socialSecurityNo = socialSecurityNo;
        this.address = address;
        this.grades = grades;
        this.graduationYear = graduationYear;
    }

    //Default constructor
    //If we do not create ANY constructor, Java creates an empty default constructor for us
    public Student() {
        /*
        we can leave it empty; we can add default arguments
        we can even call the ALL ARGUMENTS CONSTRUCTOR in here with default values
         */
        // option1: this("Unknown","Unknown","Unknown", 0, 0, "Unknown",null,0);
        firstName = "unknown";
        middleName = "unknown";
        lastName = "unknown";
        age = 0;
        socialSecurityNo = 0;
        address = "unknown";
        grades = null;
        graduationYear = 0;
    }

    //Another constructor - maybe for students who only give their name:
    public Student(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    //Methods/Behavior:
    //Setters/ Mutators (mutator methods) - allow us to add values to private attributes
    public void setName(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public void setAge(int age) {
        boolean validA = validAge(age);
        if (validA) {
            this.age = age;
        }
    }

    public void setSocialSecurityNo(long socialSecurityNo) {
        this.socialSecurityNo = socialSecurityNo;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setGrades(double grades[]) {
        this.grades = grades;
    }

    public void setGraduationYear(int graduationYear) {
        this.graduationYear = graduationYear;
    }

    //Getters (accessor) methods - they allow us to access the values of our attributes
    public String getName(){
        return firstName + " " + middleName + " " + lastName;
    }

    public int getAge(){
        return age;
    }

    public long getSocialSecurityNo() {
        return socialSecurityNo;
    }

    public String getAddress() {
        return address;
    }

    public int getGraduationYear() {
        return graduationYear;
    };

    public double[] getGrades() {
        return grades;
    }



//private - current class

    //Encapsulation:
    public boolean validAge(int age) {
        boolean isValid = true;
        if (age < 0 || age > 115) {
            isValid = false;
        }
        return isValid;
    }
}
