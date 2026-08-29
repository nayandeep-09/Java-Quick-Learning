public class Dollarprinting {

    public static void main(String[] args) {

        /*
         * Pattern to print:
         *
         * $ $ $ $
         * $     $
         * $     $
         * $ $ $ $
         *
         * We use nested loops to create
         * a hollow square pattern.
         */

        // Outer loop controls the number of rows
        for (int i = 0; i < 4; i++) {

            // Inner loop controls the columns
            for (int j = 0; j < 4; j++) {

                /*
                 * Print $ when we are on:
                 * 1. First row
                 * 2. Last row
                 * 3. First column
                 * 4. Last column
                 *
                 * Otherwise, print spaces.
                 */
                if (i == 0 || i == 3 || j == 0 || j == 3) {
                    System.out.print("$ ");
                } else {
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}