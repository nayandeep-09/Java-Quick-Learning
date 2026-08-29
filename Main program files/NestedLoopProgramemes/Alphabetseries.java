public class Alphabetseries {

    public static void main(String[] args) {

        /*
         * Pattern to print:
         *
         * A
         * A B
         * A B C
         *
         * The outer loop controls the number of rows.
         * The inner loop controls how many alphabets
         * are printed in each row.
         */

        for (int i = 0; i < 3; i++) {

            // Inner loop prints characters from A up to the current row
            for (int j = 0; j <= i; j++) {

                // Convert the number into its corresponding alphabet
                char ch = (char) ('A' + j);

                // Print the alphabet followed by a space
                System.out.print(ch + " ");
            }

            // Move to the next line after completing each row
            System.out.println();
        }
    }
}