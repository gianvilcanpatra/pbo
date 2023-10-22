/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu8kasus2;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Rectangle extends shape{
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		super("Rectangle");
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return width*length;
	}
	public String toString() {
		return super.toString() + " of length " + length + " and of width " + width;
	}
}