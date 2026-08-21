public class Statements {
    public static void main(String args[]) {

        //If else statement
        int num = 10;
        if (num % 2 == 0)
            System.out.println("It is even number");
        else
            System.out.println("It is odd number");

        // ternary operator
        int num1 = 10;
        int num2 = 20;
        int j;
        if (num1 > num2)
            j=100;
        else
            j=0;
        //  as the 10 was not greater than 20 so else part will be executed and the value of j will be 0.
        System.out.println(j);

        int n1=40;
        int n2=56;

        if (n1+n2 == 100)
            System.out.println("Sum is 100");
        else
            System.out.println("Sum is " + (n1 + n2));
    }
}
