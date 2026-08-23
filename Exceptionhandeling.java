public class Exceptionhandeling {
    public static void main(String args[]) {
        try {   //The risky code goes inside:
            int a = 10;
            int b = 0;

            int result = a / b; 
            //Division by zero is not possible, so this will throw an ArithmeticException

            System.out.println(result);
            // The code below will not be executed if an exception occurs above
            // but if no exception occurs, it will be executed
        }
        catch (ArithmeticException e) {
            // This block will be executed if an ArithmeticException occurs in the try block
            System.out.println("Cannot divide by zero");
        }
        finally {  
            // This block will always be executed, regardless of whether an exception occurred or not.
            System.out.println("Program completed");
        }
    
    }
}
