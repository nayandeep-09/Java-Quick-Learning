public class Variables {

    public static void main(String args[]) {

        // =====================================================
        // 1. BASIC VARIABLES
        // =====================================================

        // A variable is a named memory location used to store data.

        int a = 10;

        // 'f' is written after a decimal value to make it a float.
        float b = 2.5f;

        System.out.println(a);
        System.out.println(b);


        // =====================================================
        // 2. INTEGER AND DECIMAL DATA TYPES
        // =====================================================

        // int → 4 bytes (32 bits)
        int age = 20;

        // float → 4 bytes (32 bits)
        float height = 5.9f;

        // double → 8 bytes (64 bits)
        // double provides more precision than float.
        double weight = 60.5;

        // double can also store an integer value.
        double d1 = 30;

        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(d1);


        // =====================================================
        // 3. BYTE, SHORT AND LONG
        // =====================================================

        // short → 2 bytes (16 bits)
        short s = 100;

        // byte → 1 byte (8 bits)
        byte x = 1;

        // long → 8 bytes (64 bits)
        long l = 100000;

        System.out.println(s);
        System.out.println(x);
        System.out.println(l);

        // byte  → used for small integer values
        // short → used for integer values smaller than int
        // long  → used for very large integer values


        // =====================================================
        // 4. CHARACTER (char)
        // =====================================================

        // char stores a single character.
        // In Java, char uses 2 bytes (16 bits).

        char c = 'A';

        System.out.println(c);

        // A char can also be assigned an integer value.
        // Java converts the number into its corresponding
        // Unicode character.

        c = 70;

        System.out.println(c);


        // =====================================================
        // 5. TYPE CASTING
        // =====================================================

        // Type casting means converting one data type
        // into another data type.

        double value = 10.4;

        // Converting double into int.
        // The decimal part is removed.
        int a1 = (int) value;

        System.out.println(a1);
    }
}
