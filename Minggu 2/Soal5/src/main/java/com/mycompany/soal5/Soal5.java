/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal5;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.Scanner;

public class Soal5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings A and B
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        // Calculate the sum of the lengths of A and B
        int sumLengths = A.length() + B.length();

        // Check if A is lexicographically greater than B
        String lexicoComparison = A.compareTo(B) > 0 ? "Yes" : "No";

        // Capitalize the first letter of A and B
        String capitalizedA = A.substring(0, 1).toUpperCase() + A.substring(1);
        String capitalizedB = B.substring(0, 1).toUpperCase() + B.substring(1);

        // Print the results
        System.out.println("\n");
        System.out.println(sumLengths);
        System.out.println(lexicoComparison);
        System.out.println(capitalizedA + " " + capitalizedB);

        scanner.close();
    }
}
