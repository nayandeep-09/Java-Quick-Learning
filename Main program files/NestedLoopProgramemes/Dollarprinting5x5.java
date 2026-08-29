public class Dollarprinting5x5 {

    public static void main(String args[]) {

        /*
         * Pattern to print:
         *
         * $ $ $ $ $
         * $       $
         * $       $
         * $       $
         * $ $ $ $ $
         *
         * We use nested loops to create
         * a hollow square pattern.
         */

        // Outer loop controls the rows
        for (int i = 0; i < 5; i++) {

            // Inner loop controls the columns
            for (int j = 0; j < 5; j++) {

                /*
                 * Print $ if the position is on the border:
                 *
                 * i == 0  → first/top row
                 * i == 4  → last/bottom row
                 * j == 0  → first/left column
                 * j == 4  → last/right column
                 */
                if (i == 0 || i == 4 || j == 0 || j == 4) {

                    // Print $ on the border
                    System.out.print("$ ");

                } else {

                    // Print spaces inside the square
                    System.out.print("  ");
                }
            }

            // Move to the next row
            System.out.println();
        }
    }
}