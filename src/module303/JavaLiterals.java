package module303;

public class JavaLiterals {

    public static void main(String[] args) {
        int radius = 20;
        long lonVal = 3885L;
        double length = 1.5;
        float pi = 3.1415927F;
        double avagadrosNumber = 6.022e23;
        double plancksConstant = 6.62e-34;
        //char a = 'A', nine = '9', plus = '+', tilde = '~';
        char a = 0101, nine=57, plus=0x2b, tilde=126;

        String username="popcorn";
        String password="123456";

        //Character literals - unicode:

        char ch = '\u0061';
        char emptyCh = '\u0000'; //null character
        //char emptyChar = ''; //cannot do this
        String emptyString = ""; //null string

        //Escape sequences:
        System.out.println("This will print on \r\ntwo lines.");
        System.out.println("She said \"Hello\"to me!");
        System.out.println("This will print two back slashes: \\\\");
    }


}
