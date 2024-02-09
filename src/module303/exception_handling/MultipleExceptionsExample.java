package module303.exception_handling;

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        int[] nums = {3,0,7,9};
        try{ int x = nums[0] / nums[1]; // this will throw an ArithmeticException
            //  int y = nums[10]; // this would throw an ArrayIndexOutOfBoundsException
            String s = null;
            // s.length(); // this will throw Nullpointexception
        } catch (ArithmeticException eAri){
            System.out.println("Exception caught: numerator must be greater then Zero " + eAri);
            eAri.printStackTrace();
        } catch(ArrayIndexOutOfBoundsException eArr){
            System.out.println("Exception caught: You are exceed the array size " + eArr);
            eArr.printStackTrace();
        }catch (NullPointerException enull) {
            System.out.println("Exception caught:String length is Zero " + enull);
        } catch (Exception e){
            System.out.println("Exception caught: You got Error please try again" + e);
        }
        finally {
            System.out.println("finally block us always execute");
        }

    }
}
