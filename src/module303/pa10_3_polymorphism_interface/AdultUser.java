package module303.pa10_3_polymorphism_interface;

public class AdultUser implements LibraryUser {
    int age;
    String bookType;

    AdultUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age >= 12) {
            System.out.println("You have successfully registered under a Adult Account");
        }
        if (age <= 11) {
            System.out.println("Sorry, age must be greater than 12 to register as an adult.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Fiction")) {
            System.out.println("Book issued successfully, please return the book within 7 days");
        } else {
            System.out.println("Oops, you are allowed to take only adult Fiction books.");
        }
    }
}
