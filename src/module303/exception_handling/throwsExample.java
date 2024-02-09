package module303.exception_handling;
import java.io.*;

public class throwsExample {
    public void testMethod(int num) throws IOException, ArithmeticException{
        if(num==1)
            throw new IOException("IOException Occurred");
        else
            throw new ArithmeticException("ArithmeticException");
    }

    public static void main(String args[]){
        try{
            //this try block calls the above method so handle the exception
            throwsExample  obj=new throwsExample();
            obj.testMethod(1);
        }catch(Exception ex){
            System.out.println(ex);
        }
    }



}
