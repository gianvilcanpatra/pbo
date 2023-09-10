/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.week3soal6;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Gian Vilcan Patra
 */
public class Week3soal6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		BigInteger A = obj.nextBigInteger();
		BigInteger B = obj.nextBigInteger();
		
		System.out.println(A + " + "+ B + " = "+ A.add(B));
		System.out.println(A + " x "+ B + " = "+ A.multiply(B));
	}

}