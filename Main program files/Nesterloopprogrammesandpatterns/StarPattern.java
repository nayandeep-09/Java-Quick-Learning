package Nesterloopprogrammesandpatterns;
public class StarPattern {
    public static void main(String[] args) {
        
        // =====================================================
        // 1. PRINTING A BASIC PATTERN USING NESTED LOOPS
        // =====================================================

        // We want to print:
        //
        // * * * *
        // * * * *
        // * * * *
        // * * * *
        //
        // We can use nested loops for this.
        //
        // Outer loop → controls the number of rows.
        // Inner loop → controls the number of columns.

        for (int j = 0; j < 4; j++) {

            // Inner loop prints 4 values in each row.
            for (int i = 0; i < 4; i++) {

                System.out.print(i + " ");
            }

            // Move to the next line after completing one row.
            System.out.println();
        }

    }
}