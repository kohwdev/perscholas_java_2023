package module303.java_string_methods;

public class StringComparison {
    public static void main(String args[]){

        //.equals()
        String s1="PerScholas";
        String s2="PerScholas";
        String s3=new String("PerScholas");
        String s4="Teksystem";
        System.out.println(s1.equals(s2));//true
        System.out.println(s1.equals(s3));//true
        System.out.println(s1.equals(s4));//false

        //== operator
        String st1="Perscholas";
        String st2="Perscholas";
        String st3=new String("Perscholas");
        System.out.println(st1==st2);//true (because both refer to same instance)
        System.out.println(st1==st3);//false(because s3 refers to instance created in nonpool)

        //compareTo
        //The String class's compareTo() method compares values lexicographically.
        // It returns an integer value that describes if the first string is less than,equal to, or greater than the second string.
        String str1="Perscholas";
        String str2="Perscholas";
        String str3="Perschola";
        String str4="PerscholasX";
        System.out.println(str1.compareTo(str2)); //0
        System.out.println(str1.compareTo(str3)); // 1(because s1>s3)
        System.out.println(str1.compareTo(str4)); // -1(because s1<s4 )
    }

}
