package module303.pa10_3_polymorphism_interface;

public class KidUser implements LibraryUser {
    int age;
    String bookType;


    KidUser(String bookType) {
        this.bookType = bookType;
    }

    KidUser(int age, String bookType) {
        this.age = age;
        this.bookType = bookType;
    }

    @Override
    public void registerAccount() {
        if (age <= 11) {
            System.out.println("You have successfully registered under a Kids Account");
        }
        if (age > 11) {
            System.out.println("Sorry, age must be less than 12 to register as a kid.");
        }
    }

    @Override
    public void requestBook() {
        if (bookType.equalsIgnoreCase("Kids")) {
            System.out.println("Book issued successfully, please return the book within 10 days");
        } else {
            System.out.println("Oops, you are allowed to take only kids books.");
        }
    }
}
