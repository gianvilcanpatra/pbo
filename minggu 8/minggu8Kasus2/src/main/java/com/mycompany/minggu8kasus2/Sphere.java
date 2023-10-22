/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu8kasus2;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Sphere extends shape{
	private double radius;

	public Sphere(double r) {
		super("Sphere");
		this.radius = r;
	}
	
	@Override
	public double area() {
		return 4*Math.PI*radius*radius;
	}
	public String toString() {
		return super.toString() + " of radius " + radius;
	}
	
}
