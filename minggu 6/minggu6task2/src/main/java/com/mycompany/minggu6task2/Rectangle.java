/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu6task2;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Rectangle extends Shape{
	private double width;
	private double length;
	
	public Rectangle() {
		super();
		this.width = 1.0;
		this.length = 1.0;
	}
	
	public Rectangle(double width, double length) {
		super();
		this.width = width;
		this.length = length;
	}
	
	public Rectangle(double width, double length, String Color, boolean Filled) {
		super(Color, Filled);
		this.width = width;
		this.length = length;
	}
	
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
}
