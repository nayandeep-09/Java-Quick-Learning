public class Variables {
    public static void main(String args[]) {
        int a = 10;
        float b = 2.5f;// need to write f in the end of float value.
        System.out.println(a);
        System.out.println(b);

        int age = 20; // int store data in 4 byte or 32bits
        float height = 5.9f; // float stores the data in the 4 byte or 32 bits
        double weight = 60.5; // double stores the data in the 8 byte or 64 bits which is more than float.

        double d1 = 30;// double can store the integer value also.
        System.out.println(age);
        System.out.println(height);
        System.out.println(weight);
        System.out.println(d1);

        short s = 100; // short stores the data in the 2 byte or 16 bits which less than int.
        byte x = 1; // byte stores the data in the 1 byte or 8 bits which less than short.
        long l = 100000; // long stores the data in the 8 byte or 64 bits which is more than int.
        System.out.println(s);
        System.out.println(x);
        System.out.println(l);

        // Short used to store less storage taking values;
        // byte used to store the data in single byte or 8 bits;
        // long used to store large values which is more than int.

        char c = 'A'; // char stores the data in 2 byte or 16 bits which is used to store single
                      // character.
        System.out.println(c);
        c = 70; // char can also store the integer value which is converted to character
                // according to ASCII value.
        System.out.println(c);

        int a1 = (int) 10.4; // type casting is used to convert the data from one type to another type.
                             // its basically used to print the decimal value in integer format.
        System.out.println(a1);
    }
}