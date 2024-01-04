package module303;

public class CharacterClassDemo {
    public static void main(String[] args) {
        char letter = 'g';
        char num = '7';
        Character letter2 = Character.valueOf('g'); //defining a character object
        Character num2 = Character.valueOf('7');

        //if character is a digit:
        boolean isADigit = Character.isDigit(letter);
        System.out.println(isADigit);
        boolean isALetter = Character.isLetter(letter);
        System.out.println(isALetter);
        boolean isADigitOrLetter = Character.isLetterOrDigit(letter);
        System.out.println(isADigitOrLetter);
        boolean isInLower = Character.isLowerCase(letter);
        System.out.println(isInLower);
        boolean isInUpper = Character.isUpperCase(letter);
        System.out.println(isInUpper);
        char toLower = Character.toLowerCase(letter);
        System.out.println(toLower);
        char toUpper = Character.toUpperCase(num);
        System.out.println(toUpper);


        Character letter3 = 'A';
        System.out.println(letter3);
        Character asciNumber = 97;
        System.out.println(asciNumber);
        Character uninumber = '\u0031';
        Character uninumber2 = '\u0032';
        System.out.println(uninumber);
        System.out.println(uninumber2);
        System.out.println("======compareTo========");
        Character Obj1 = '2';
        Character Obj2 = '2';
        int result =    Obj1.compareTo(Obj2);
        System.out.println(result);
        System.out.println("----equals() -------");
        boolean  result2 =    Obj1.equals(Obj2);
        System.out.println(result2);
        System.out.println("----isletter() -------");
        // isletter method determines wheather the specified char value is letter
        System.out.println(Obj1.isLetter(Obj2));
        System.out.println("----isDiggit() -------");
        // isDiggit() determin whether the specified char value is a digit
        System.out.println( Obj2.isDigit(Obj1));
        Obj1.valueOf('A');   // Obj1 = 'A'
        System.out.println("----compareTo-------");
        Character a = 'B';
        Character aa = 'B';
        System.out.println(a == aa);
        int rs =  a.compareTo(aa);
        System.out.println(rs);

    }
}
