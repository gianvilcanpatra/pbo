/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.minggu8kasus3;

/**
 *
 * @author Gian Vilcan Patra
 */
public class weeklySales {
	public static void main(String[] args)
	{
		 Salesperson [] salesStaff = new Salesperson [4];
		 salesStaff[0] = new Salesperson ("Gian", "Greenwood", 3000);
		 salesStaff[1] = new Salesperson ("Vilcan", "Mount", 4000);
		 salesStaff[2] = new Salesperson ("Patra", "Havertz", 3000);
		 salesStaff[3] = new Salesperson ("Juan", "Mobius", 2800);
		 Sorting.selectionSort(salesStaff);
		 System.out.println("\nRanking of Sales for the week\n");
		 for(Salesperson s : salesStaff)
		 System.out.println(s);
	}
}

