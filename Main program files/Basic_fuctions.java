public class Basic_fuctions {
    public static void main(String args[]) {    

        // to print anything in the console we can use the System.out.println() method.
        System.out.println("Hello World");

        //print any variable in the console using System.out.println() method.
        int a = 10;
        System.out.println(a); 

        // to print any variable in the console we can use the System.out.println() method.
        float b = 2.5f;
        System.out.println(b);

        // to print any variable in the console we can use the System.out.println() method.
        char c = 'A';
        System.out.println(c);


        //to take input from the user we can use the Scanner class which is present in the java.util package.
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter a number: ");  
        int input = sc.nextInt();
        System.out.println("You entered: " + input);



        int age=10;
        float height=20.5f;
        float weight=55.3f;
        System.out.println(age + ", " + height + ", " + weight);


    }
}