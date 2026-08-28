public class Printonetoten {
    public static void main(String args[]) {
        // Print numbers 1 to 10 using a while loop
        int a = 1;
        while (a <= 10) {
            System.out.print(a + " ");
            a++;
        }

        System.out.println("");

        // Print numbers 10 to 1 using a for loop
        for (int b = 10; b >= 1; b--) {
            System.out.print(b + " ");
        }
    }
}