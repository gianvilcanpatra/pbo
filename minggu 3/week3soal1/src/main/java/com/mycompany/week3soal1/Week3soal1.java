/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week3soal1;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.Scanner;

public class Week3soal1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                String input = scanner.nextLine().trim();

                if (input.isEmpty()) {
                    System.out.println("Kata tidak boleh kosong");
                } else {
                    String[] words = input.split("[\\s!?,._'@]");
                    System.out.println("" + words.length);
                    for (String word : words) {
                        System.out.println(word);
                    }
                }
            } while (true);
        } 
    }
}
