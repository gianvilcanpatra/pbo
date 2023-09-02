/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.soal1;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) {
        System.out.println("Berapa kali anda ingin menginput :");        
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.nextLine(); // Membaca karakter newline setelah angka t
        for (int i = 0; i < t; i++) {
            String input = scanner.nextLine();
            try {
                long n = Long.parseLong(input);

                System.out.println(" can be fitted in:");

                if (n >= Byte.MIN_VALUE && n <= Byte.MAX_VALUE) {
                    System.out.println("* byte");
                }
                if (n >= Short.MIN_VALUE && n <= Short.MAX_VALUE) {
                    System.out.println("* short");
                }
                if (n >= Integer.MIN_VALUE && n <= Integer.MAX_VALUE) {
                    System.out.println("* int");
                }
                System.out.println("* long");
            } catch (NumberFormatException e) {
                System.out.println(input + " can't be fitted anywhere.");
            }
        }
        scanner.close();
    }
}

