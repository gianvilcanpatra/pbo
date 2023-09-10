/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week3soal5;
import java.util.Scanner;
/**
 *
 * @author Gian Vilcan Patra
 */
public class Week3soal5 {

	public static void main(String[] args) {
            
		Scanner obj = new Scanner(System.in);
		String str = obj.nextLine();
		
		String[] Part = str.split(" ");
		String value = "";
		
		for(int i=0; i<Part.length; i++) {
			value += Part[i];
		}

		Long result = Long.valueOf(value);
		
		if(((result-999999)%5) != 0) {
			System.out.println("Berhenti");
		}
		else {
			System.out.println("Jalan");
		}
	}

}
