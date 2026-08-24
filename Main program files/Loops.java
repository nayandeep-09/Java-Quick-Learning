public class Loops {

    public static void main(String args[]) {

        // =====================================================
        // 1. FOR LOOP
        // =====================================================

        // A for loop is generally used when we know
        // how many times we want to repeat something.

        // Without a loop:
        //
        // System.out.println("Nayandeep");
        // System.out.println("Nayandeep");
        // System.out.println("Nayandeep");
        // System.out.println("Nayandeep");

        // Using a for loop:

        for (int i = 0; i < 4; i++) {

            // i starts from 0.
            // Check: i < 4
            // If true → execute the code.
            // Then i increases by 1.
            // The condition is checked again.

            System.out.println("Nayandeep");
        }


        // =====================================================
        // 2. WHILE LOOP
        // =====================================================

        // A while loop checks the condition FIRST.
        // If the condition is true, the loop executes.

        int j = 0;

        while (j < 4) {

            System.out.println("Nayandeep");

            // Increase j by 1.
            // This is important to eventually stop the loop.
            j++;
        }


        // =====================================================
        // 3. DO-WHILE LOOP
        // =====================================================

        // A do-while loop executes the code FIRST
        // and checks the condition AFTERWARD.

        int k = 0;

        do {

            System.out.println("Nayandeep");

            // Increase k by 1.
            k++;

        } while (k < 4);


        // =====================================================
        // 4. BASIC LOOP SYNTAX
        // =====================================================

        /*
         * FOR LOOP
         *
         * for (initialization; condition; update) {
         *     // code
         * }
         *
         *
         * WHILE LOOP
         *
         * initialization;
         *
         * while (condition) {
         *     // code
         *     update;
         * }
         *
         *
         * DO-WHILE LOOP
         *
         * initialization;
         *
         * do {
         *     // code
         *     update;
         * } while (condition);
         */


        // =====================================================
        // 5. MAIN DIFFERENCE
        // =====================================================

        /*
         * FOR:
         * Condition is checked before execution.
         * Best when number of repetitions is known.
         *
         * WHILE:
         * Condition is checked before execution.
         * Best when number of repetitions may not be known.
         *
         * DO-WHILE:
         * Code executes at least once because the
         * condition is checked after execution.
         */
    }
}