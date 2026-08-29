public class Operators {

    public static void main(String args[]) {

        // =====================================================
        // 1. ARITHMETIC OPERATORS
        // =====================================================

        // Arithmetic operators are used to perform
        // mathematical calculations.

        int a = 10;
        int b = 20;

        int addition = a + b;             // Addition
        int subtraction = a - b;          // Subtraction
        int multiplication = a * b;       // Multiplication
        int division = a / b;             // Integer division
        float division2 = (float) a / b;  // Floating-point division
        int modulus = a % b;              // Remainder

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Integer Division: " + division);
        System.out.println("Float Division: " + division2);
        System.out.println("Modulus: " + modulus);


        // =====================================================
        // 2. SHORTHAND / ASSIGNMENT OPERATORS
        // =====================================================

        // Shorthand operators perform an operation and
        // assignment in a single statement.

        // a += 5 is the same as: a = a + 5
        a += 5;
        System.out.println("After a += 5: " + a);

        // b -= 5 is the same as: b = b - 5
        b -= 5;
        System.out.println("After b -= 5: " + b);

        // Other shorthand operators:
        // a *= 5;   → a = a * 5
        // a /= 5;   → a = a / 5
        // a %= 5;   → a = a % 5


        // =====================================================
        // 3. INCREMENT AND DECREMENT OPERATORS
        // =====================================================

        // ++ increases the value by 1.
        // -- decreases the value by 1.

        // Post-increment: first use the value, then increase it.
        a++;
        System.out.println("After a++: " + a);

        // Post-decrement: first use the value, then decrease it.
        a--;
        System.out.println("After a--: " + a);

        // Pre-increment: increase the value first.
        ++b;
        System.out.println("After ++b: " + b);

        // Pre-decrement: decrease the value first.
        --b;
        System.out.println("After --b: " + b);


        // =====================================================
        // 4. RELATIONAL OPERATORS
        // =====================================================

        // Relational operators compare two values.
        // The result is always true or false.

        int c = 5;
        int d = 10;

        System.out.println("c > d  : " + (c > d));   // Greater than
        System.out.println("c < d  : " + (c < d));   // Less than
        System.out.println("c >= d : " + (c >= d));  // Greater than or equal
        System.out.println("c <= d : " + (c <= d));  // Less than or equal
        System.out.println("c == d : " + (c == d));  // Equal to
        System.out.println("c != d : " + (c != d));  // Not equal to


        // =====================================================
        // 5. BITWISE OPERATORS
        // =====================================================

        // Bitwise operators work on the binary representation
        // of integer values.

        int e = 5;    // Binary: 0101
        int f = 10;   // Binary: 1010

        // AND
        System.out.println("e & f = " + (e & f));

        // OR
        System.out.println("e | f = " + (e | f));

        // XOR
        System.out.println("e ^ f = " + (e ^ f));

        // NOT
        System.out.println("~e = " + (~e));

        // Left shift
        System.out.println("e << 2 = " + (e << 2));

        // Right shift
        System.out.println("e >> 2 = " + (e >> 2));


        // =====================================================
        // 6. QUICK OPERATOR SUMMARY
        // =====================================================

        // Arithmetic:
        // +   -   *   /   %

        // Assignment:
        // =   +=   -=   *=   /=   %=

        // Increment / Decrement:
        // ++   --

        // Relational:
        // >   <   >=   <=   ==   !=

        // Bitwise:
        // &   |   ^   ~   <<   >>
    }
}
