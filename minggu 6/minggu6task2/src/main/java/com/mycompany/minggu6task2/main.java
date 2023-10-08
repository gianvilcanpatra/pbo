/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu6task2;

/**
 *
 * @author Gian Vilcan Patra
 */
public class main {

	public static void main(String[] args) {
		Square kotak = new Square(15);
		System.out.println(kotak.toString());
		
		Circle lingkaran = new Circle(14);
		lingkaran.setColor("Blue");
		System.out.println(lingkaran.toString());
	}

}
