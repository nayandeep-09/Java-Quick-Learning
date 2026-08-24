import java.util.Scanner;

public class Basic_fuctions {

    public static void main(String args[]) {

        // =====================================================
        // 1. PRINTING OUTPUT
        // =====================================================

        // System.out.println() prints something and then
        // moves the cursor to the next line.

        System.out.println("Hello World");

        // Printing an integer variable
        int a = 10;
        System.out.println(a);

        // Printing a float variable
        // 'f' is required when directly assigning a decimal
        // value to a float.
        float b = 2.5f;
        System.out.println(b);

        // Printing a character
        char c = 'A';
        System.out.println(c);


        // =====================================================
        // 2. TAKING INPUT FROM USER
        // =====================================================

        // Scanner is used to take input from the keyboard.
        // Scanner belongs to the java.util package.

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");

        // nextInt() takes an integer as input.
        int input = sc.nextInt();

        System.out.println("You entered: " + input);


        // =====================================================
        // 3. PRINTING MULTIPLE VARIABLES
        // =====================================================

        int age = 10;
        float height = 20.5f;
        float weight = 55.3f;

        // '+' joins different values together.
        System.out.println(age + ", " + height + ", " + weight);


        // Close Scanner when it is no longer needed.
        sc.close();
    }
}