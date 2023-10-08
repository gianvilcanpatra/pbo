/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu6task2;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Shape {
	private String color;
	private boolean filled;
	
	public Shape() {
		color = "red";
		filled = true;
	}
	
	public Shape(String Color, boolean Filled) {
		color = Color;
		filled = Filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public String toString() {
		return "Shape[Color = " + this.color + ", filled = " + this.filled +"]";
	}
	
}

