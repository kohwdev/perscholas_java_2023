package module303;

public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        //Assigning Primitive Values
        int j, k;
        j = 10; //j gets the value 10.
        j = 5; //j gets the value 5. The previous value is overwritten.
        k = j; //k gets the value 5.
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);

        //Multiple Assignments
        k = j = 10; // (k = (j = 10))
        System.out.println("j is : " + j);
        System.out.println("k is : " + k);


        //TODO Auto-generated method stub
        int x, y = 10, z = 5;
        x = y + z;
        System.out.println("+ operator resulted in " + x);
        x = y - z;
        System.out.println("- operator resulted in " + x);
        x = y * z;
        System.out.println("* operator resulted in " + x);
        x = y / z;
        System.out.println("/ operator resulted in " + x);
        x = y % z;
        System.out.println("% operator resulted in " + x);
        x = y++;
        System.out.println("Postfix ++ operator resulted in " + x);
        x = ++z;
        System.out.println("Prefix ++ operator resulted in " + x);
        x = -y;
        System.out.println("Unary operator resulted in " + x);
        //Some examples of special cases
        int tooBig = Integer.MAX_VALUE + 1;
        int tooSmall = Integer.MIN_VALUE - 1;

        System.out.println("tooBig becomes " + tooBig);
        System.out.println("tooSmall becomes " + tooSmall);

        System.out.println(4.0 /0.0);
        System.out.println(-4.0 / 0.0);
        System.out.println(0.0 / 0.0);
        double d1 = 12 / 8;
        double d2 = 12.0F / 8;
        System.out.println("d1 is " + d1);
        System.out.println("d2 is " + d2);


    }
}
