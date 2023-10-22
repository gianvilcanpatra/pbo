/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu8kasus2;

/**
 *
 * @author Gian Vilcan Patra
 */
public abstract class shape {
	private String shapeName;
	
	public shape(String shapename) {
		this.shapeName = shapename;
	}
	
	public abstract double area();
        
	public String toString() {
		String Result = "Shape Name " + this.shapeName;
		return Result;
	}
	
}
