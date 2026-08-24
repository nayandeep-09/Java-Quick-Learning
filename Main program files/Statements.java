public class Statements {

    public static void main(String args[]) {

        // =====================================================
        // 1. IF-ELSE STATEMENT
        // =====================================================

        // if-else is used when we want to execute different
        // code depending on whether a condition is true or false.

        int num = 10;

        if (num % 2 == 0) {
            System.out.println("It is an even number");
        } else {
            System.out.println("It is an odd number");
        }


        // =====================================================
        // 2. TERNARY OPERATOR
        // =====================================================

        // Ternary operator is a short form of simple if-else.
        //
        // Syntax:
        // condition ? value_if_true : value_if_false;

        int num1 = 10;
        int num2 = 20;

        // Normal if-else equivalent:
        //
        // if (num1 > 10) {
        //     num2 = 120;
        // } else {
        //     num2 = 0;
        // }

        // Short form using ternary operator:
        num2 = (num1 > 10) ? 120 : 0;

        // If num1 > 10 → num2 = 120
        // Otherwise     → num2 = 0

        System.out.println("Ternary result: " + num2);


        // =====================================================
        // 3. IF-ELSE WITH CALCULATION
        // =====================================================

        int n1 = 40;
        int n2 = 56;

        if (n1 + n2 == 100) {
            System.out.println("Sum is 100");
        } else {
            System.out.println("Sum is " + (n1 + n2));
        }


        // =====================================================
        // 4. IF-ELSE WITH AGE
        // =====================================================

        int age = 20;

        if (age >= 18) {
            System.out.println("Person is an adult");
        } else {
            System.out.println("Person is not an adult");
        }


        // =====================================================
        // 5. SWITCH STATEMENT
        // =====================================================

        // switch is useful when we need to compare one
        // variable with multiple fixed values.

        int a = 1;

        // The following if-else ladder can be replaced
        // by a switch statement:

        /*
        if (a == 1)
            System.out.println("Monday");
        else if (a == 2)
            System.out.println("Tuesday");
        else if (a == 3)
            System.out.println("Wednesday");
        else if (a == 4)
            System.out.println("Thursday");
        else if (a == 5)
            System.out.println("Friday");
        else if (a == 6)
            System.out.println("Saturday");
        else if (a == 7)
            System.out.println("Sunday");
        else
            System.out.println("Invalid day");
        */


        // Same logic using switch:

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

        
        // String in switch statement
        // yes we can use string in switch statement from Java 7 onwards.
        

        String day = "Monday";

        switch (day) {

            case "Monday":
                System.out.println("First day of the week");
                break;

            case "Tuesday":
                System.out.println("Second day of the week");
                break;

            case "Wednesday":
                System.out.println("Third day of the week");
                break;

            case "Thursday":
                System.out.println("Fourth day of the week");
                break;

            case "Friday":
                System.out.println("Fifth day of the week");
                break;

            case "Saturday":
                System.out.println("Sixth day of the week");
                break;

            case "Sunday":
                System.out.println("Seventh day of the week");
                break;

            default:
                System.out.println("Invalid day");
        }
    }
}