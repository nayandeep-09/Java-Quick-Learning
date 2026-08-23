public class Operators {
    public static void main(String args[]) {
        //Arithmetical Operators
        int a = 10;
        int b = 20;
        int addition = a + b;
        int subtraction = a - b;
        int multiplication = a * b;
        int division = a / b;
        float division2 = (float) a / b; ///it will print the float answer if asnwer is in float.
        int modulus = a % b;
        System.out.println(addition);
        System.out.println(subtraction);
        System.out.println(multiplication);
        System.out.println(division);
        System.out.println(division2);  
        System.out.println(modulus);

        //we alos can use the shorthand operators to perform the same operation in a single line.
        a += 5; // equivalent to a = a + 5
        System.out.println(a);
        b -= 5; // equivalent to b = b - 5
        System.out.println(b);

        //
        a++; // post increment operator by 1
        System.out.println(a);
        a--; // post decrement operator by 1
        System.out.println(a);
        ++b; // pre increment operator by 1
        System.out.println(b);
        --b; // pre decrement operator by 1
        System.out.println(b);

        //Relational Operators
        int c = 5;
        int d = 10;
        System.out.println(c > d); // greater than operator
        System.out.println(c < d); // less than operator
        System.out.println(c >= d); // greater than or equal to operator
        System.out.println(c <= d); // less than or equal to operator
        System.out.println(c == d); // equal to operator
        System.out.println(c != d); // not equal to operator

        //Bitwise Operators
        int e = 5; // binary representation: 0101
        int f = 10; // binary representation: 1010
        System.out.println(e & f); // bitwise AND operator
        System.out.println(e | f); // bitwise OR operator
        System.out.println(e ^ f); // bitwise XOR operator
        System.out.println(~e); // bitwise NOT operator
        System.out.println(e << 2); // left shift operator
        System.out.println(e >> 2); // right shift operator
      }
}
