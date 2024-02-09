package module303.exception_handling;

public class ExceptionsExample {
    public static void main(String[] args) {

        //ArithmeticException
        try {
            int d = 0;
            int n = 5;
            // code that generates exception
            int divideByZero = n / d;
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException occur  => " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("This is the finally block");
        }


        //ArrayIndexOutOfBoundsException
        try {
            String[] st = {"A","B","C","D","E"};
            st[11] = "X";
        }
        catch(ArrayIndexOutOfBoundsException e){

            System.out.println("index position is not exsist --> " + e.getMessage());
            // e.printStackTrace();
        }
        finally {
            System.out.println("This is the finally block");
        }

        //NullPointerException

        String ptr = null;

        // Checking if ptr.equals null or works fine.
        try
        {
            // This line of code throws NullPointerException
            // because ptr is null
            if (ptr.equals("hello"))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        }
        catch(NullPointerException e)
        {
            System.out.print("NullPointerException Caught => " + e.getMessage());
        }







    }
}
