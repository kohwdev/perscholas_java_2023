package module303;

public class StringExamples {
    public static void main(String[] args) {
        //String is immutable - you cannot change the OBJECT itself, just the REFERENCE to it
        String s1 = "welcome";
        String s2 = "welcome";

        //new operator:
        String s = new String("WELCOME");

        System.out.println(s.length());
        System.out.println(s.isEmpty());
        System.out.println(s.isBlank());
        System.out.println(s.equals(s1));
        System.out.println(s.equalsIgnoreCase(s1));
        System.out.println(s.compareTo(s2));
        System.out.println(s.startsWith("a"));
        System.out.println(s.indexOf("E"));
        System.out.println(s.lastIndexOf("C"));

        String lowerWelcome = s.toLowerCase();
        System.out.println(lowerWelcome);

        System.out.println(s.matches(s1));
        String newStr = s.replace("W", "s");
        System.out.println(newStr);

        //Split string into separate words
        String words = "Welcome to Java";
        String[] wordsFromWords = words.split(" ");
        for (int i = 0; i < wordsFromWords.length; i++) {
            System.out.println(wordsFromWords[i]);
        }

        char[] sToChar = s.toCharArray();
        for (int i = 0; i < sToChar.length; i++) {
            System.out.println(sToChar[i]);
        }

        //replaceAll
        String str1 = "aabbaaac";
        String str2 = "Learn223Java55from555perscholas";

        // regex for sequence of digits
        String regex = "\\d+";

        // all occurrences of "aa" is replaceAll with "zz"
        System.out.println(str1.replaceAll("aa", "zz"));

        // replace a digit or sequence of digits with a whitespace
        System.out.println(str2.replaceAll(regex, " "));



    }
}
