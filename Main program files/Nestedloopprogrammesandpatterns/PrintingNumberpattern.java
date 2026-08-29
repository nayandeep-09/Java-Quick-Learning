package Nestedloopprogrammesandpatterns;
public class PrintingNumberpattern {
    public static void main(String args[]) {

        // Print numbers in a pattern
        // We want to print:
        //
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5
        // 1 2 3 4 5 6
        //
        // We can use nested loops for this.
       
        // Outer loop → controls the rows
        for (int x = 1; x <= 6; x++) {

            // Inner loop → prints numbers from 1 to x
            for (int y = 1; y <= x; y++) {

                // Print the current number
                System.out.print(y + " ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}