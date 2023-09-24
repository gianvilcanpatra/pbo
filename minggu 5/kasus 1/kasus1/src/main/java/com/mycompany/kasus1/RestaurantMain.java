/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kasus1;

/**
 *
 * @author Gian Vilcan Patra
 */
public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant ();
        menu.tambahMenuMakanan ("Bala-bala", 1_100, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Gehu", 1_100, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Tahu", 1_100, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan ("Molen", 1_100, 20);
        
        menu.tampilMenuMakanan();
        
        System.out.println("");
        
        menu.pemesanan(1,3);
	menu.pemesanan(2,1);
        menu.pemesanan(3,4);
        menu.pemesanan(4,2);
        
	menu.tampilMenuMakanan();
        
        
    }
}
