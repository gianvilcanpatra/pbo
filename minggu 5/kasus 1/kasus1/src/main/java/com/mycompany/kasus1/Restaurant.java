/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kasus1;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Restaurant {
	private Pesanan[] food;
	private static byte id=0;
	
	public static byte getId() {
		return id;
	}

	public static void setId(byte id) {
		Restaurant.id = id;
	}
	
	public Restaurant() {
		food = new Pesanan[10];
 	}
			
	public void tambahMenuMakanan(String nama, double harga, int stok) {
		this.food[id] = new Pesanan(nama,harga,stok);
	}
	
	public void tampilMenuMakanan() {
		for(int i = 0; i <= id; i++) {
			if(!isOutOfStock(i)) {
				System.out.print(i+1 + " "); 
				this.food[i].TampilMakanan();
				System.out.println("");
			}
		}
	}
	
	public void pemesanan(int idMakanan, int jumlah) {
		for(int i =0;i<=id;i++) {
			if(i == idMakanan-1) {
				this.food[i].kurangStok(jumlah);
			}
		}
	}
	
	public boolean isOutOfStock(int id) {
		if(food[id].getStok() == 0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void nextId() {
		id++;
		setId(id);
	}
}