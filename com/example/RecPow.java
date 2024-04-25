
package com.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/**
 * Recursively calculates powers.
 *
 * @author Christopher Di Bert
 * @version 1.0
 * @since 2024-04-25
 */

// RecPow class
public final class RecPow {

    /** Private constructor to prevent instantiation. */
    private RecPow() {
        throw new UnsupportedOperationException("Cannot instantiate");
    }

    /**
     * This is the main method.
     *
     * @param args Unused
     */
    public static void main(final String[] args) {
        // Creates the input and output file paths.
        final File inputPath = new File("/home/vscode/ICS4U/Unit3/Unit3-04/Unit3-04-Java-Power/com/example/input.txt");
        final File outputPath = new File("/home/vscode/ICS4U/Unit3/Unit3-04/Unit3-04-Java-Power/com/example/output.txt");

        try {
        // Creates scanner and writer.
        Scanner sc = new Scanner(inputPath);
        FileWriter fileWriter = new FileWriter(outputPath);
        BufferedWriter writer = new BufferedWriter(fileWriter);
        while (sc.hasNext()) {
            // Tries to cast the input to an int and pass it to RecFib.
            try {
                // Gets the integer value of the base.
                int base = Integer.parseInt(sc.next());
                // Gets the integer value of the exponent.
                int exponent = Integer.parseInt(sc.next());
                // Writes the fibonacci number to the output file.
                writer.write(String.valueOf(RecursivePow(base, exponent)));
                // If there wasn't an integer to be read from the input file.
            } catch (Exception e) {
            writer.write("Must enter an integer!");
            }
            // Creates a new line in the output file.
            writer.newLine();
            // Goes to the next line in the input file.
            sc.nextLine();
        }
        sc.close();
        writer.close();
        // Error thrown if an invalid file path was defined.
        } catch (Exception e) {
        System.out.println("Invalid path(s)!");
        }
    }

  /**
   * Method to recursively find the power of a number
   *
   * @param base passed.
   * @param exponent passed.
   * @return 1.
   * @return base.
   * @return base * RecursivePow(base, exponent - 1).
   */
    private static int RecursivePow(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else if (exponent == 1) {
            return base;
        }
        else {
            return base * RecursivePow(base, exponent - 1);
        }
    }

}
