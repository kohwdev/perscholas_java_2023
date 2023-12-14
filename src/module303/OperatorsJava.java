package module303;

public class OperatorsJava {
    public static void main(String[] args) {
        /*

        //Defined variables:
        double a=100, b=51, v;
        //Addition:
        v=a+b;
        //Subtraction:
        v=a-b;
        //Multiplication:
        v=a*b;
        //Division:
        v=a/b;
        //Modulus:Remainder operator - calculates what is left over after division
        v=a%b;

        System.out.println(v);

        //Relational Operators:
        int c=3, d=4;
        boolean r;
        //== equal to, unlike the =
        r = (c==d); //false

        System.out.println(r);
        //!= not equal to:
        r = (c!=d); //true
        System.out.println(r);

        //> greater than
        r=(c>d); //false
        System.out.println(r);

        //< less than
        r=(c<d); //true
        System.out.println(r);

        // >= greater than or equal to:
        r=(c>=d); //false
        System.out.println(r);

        // <= less than or equal to:
        r=(c<=d); //true
        System.out.println(r);


        //instanceof
        Animal myAnimal = new Animal();
        System.out.println(myAnimal instanceof Animal);

        //Logical Operators
        //&& - Logical and - BOTH conditions have to be true for it to return true
        r = (a>d) && (d>c);
        System.out.println(r);

        //Short circuit evaluation - AND - if the first one is false, the whole thing is falsified
        r = (a<d) && (d>c);
        System.out.println(r);

        //Logical OR - either or of the conditions can be true for everything to be true:
        r= (a>d) || (d>c);
        System.out.println(r);

        //Short circuit OR - if the first statement is TRUE Java will automatically return true
        r = (a>b) || (d>c);
        System.out.println(r);


        /*
        * We use two operands as opposed to one for our logical operations because using one is
        * set aside for bitwise operations and no short-circuiting but using two operands enforces short-circuiting
        * so & is the bitwise AND operator and && is the formal AND logical operator.
        * */

        /*

        //Assignment Operators - shortened form of assigning something back to a variable:
        int x = 1;
        x = x + 5; //x+=5
        System.out.println(x);

        x -= 5; //x = x - 5;
        System.out.println(x);

        x *= 5; //x = x * 5;
        System.out.println(x);

        x /= 5; //x = x / 5;
        System.out.println(x);

        x %= 5; //x = x % 5;
        System.out.println(x);

        */
        //Unary Operators:
        int a=20, b=10, c=0, d=20, e=40; //f=30;
        //Unary minus
        int result = -a;
        System.out.println(result);

        //Increment Operator: used to increment (increase a value by 1);
        //postfix increment: value is first used for computing and then incremented:
        c = b++;
        System.out.println("Value of c (b++) = " + c);
        System.out.println("Value of b = " + b);

        //prefix increment: value is incremented first, then result is computed:
        c = ++a;
        System.out.println(c);
        System.out.println(a);

        int f=20, g=10, h=0, i=20, j=40, k=30;

        //postfix decrement - value is used for computing the result an then decremented
        h = j--;
        System.out.println(h);
        System.out.println(j);
        //prefix decrement - value is decremented and then result is computed
        h = --i;
        System.out.println(h);
        System.out.println(i);

        for (int n = 0; n < 100; ++n) {

        }


    }
}
