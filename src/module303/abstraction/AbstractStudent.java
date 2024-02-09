package module303.abstraction;
//High level classes; CORE functionality (but when we are not sure of the implementation)
//Templates but high-level where we do not want to include the complete implementation.

public abstract class AbstractStudent {
    //static final protected String COLLEGENAME = "Per scholas";
    protected String username;
    protected String password;
    protected int rollnumber;

    // abstract method
    //An abstract method is a method that is declared without any implementation.
    //It is declared in an abstract class and must be implemented by all the subclasses of that class.
    //Abstract methods are used to provide a blueprint for subclasses.
    // The subclasses can then implement the abstract methods in their own way.
    // This allows for flexibility and code reuse.

    public abstract  void displayinformation();
    public abstract String[] getFullName(String[] fullname);

    // regular methods
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public int getRollnumber() {
        return rollnumber;
    }
    public void setRollnumber(int rollnumber) {
        this.rollnumber = rollnumber;
    }
}
