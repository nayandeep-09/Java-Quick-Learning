public class Statements {
    public static void main(String args[]) {

        //If else statement
        int num = 10;
        if (num % 2 == 0)
            System.out.println("It is even number");
        else
            System.out.println("It is odd number");

      //ternary operator

        int num1 = 10;
        int num2 = 20;
 
        // if (num1 > 10)
        //     num2 = 120;
        // else
        //     num2=0;

        // Replacement short code of ternary operator
        num2 = (num1 > 10) ? 120 : 0;
        // if num1 is greater than 10, then num2 will be assigned 120, otherwise it will be assigned 0
        System.out.println(num2);

        int n1=40;
        int n2=56;

        if (n1+n2 == 100)
            System.out.println("Sum is 100");
        else
            System.out.println("Sum is " + (n1 + n2));

        int age = 20;
        if (age >= 18)
            System.out.println("Person is adult");
        else
            System.out.println("Person is not adult");
    
    
        // SWITCH statement

        int a=1;

        // if (a==1)
        //     System.out.println("Monday");
        // else if (a==2)
        //     System.out.println("Tuesday");
        // else if (a==3)
        //     System.out.println("Wednesday");
        // else if (a==4)
        //     System.out.println("Thursday");
        // else if (a==5)
        //     System.out.println("Friday");
        // else if (a==6)
        //     System.out.println("Saturday");
        // else if (a==7)
        //     System.out.println("Sunday");
        // else
        //     System.out.println("Invalid day");


        // to replce the above if else statement we can use switch statement
        
        switch (a) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;  
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;  
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }

        
    }
}
