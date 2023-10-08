/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu6task2;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Circle extends Shape{
	private double radius;

	public Circle() {
		super();
		this.radius = 1.0;
	}
	
	public Circle(double Radius) {
		super();
		this.radius = Radius;
	}
	
	public Circle(double Radius, String Color, boolean Filled) {
		super(Color,Filled);
		this.radius = Radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		 return radius*radius*Math.PI;
	 }
	
	public double getPerimeter() {
		return 2*radius*Math.PI;
	}
	
}
