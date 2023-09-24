/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kasus1;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Pesanan {
	private String nama_makanan;
	private double harga_makanan;
	private int stok;

	public String getNama_makanan() {
		return nama_makanan;
	}

	public double getHarga_makanan() {
		return harga_makanan;
	}

	public int getStok() {
		return stok;
	}
	
	public Pesanan(String namaMakanan, double hargaMakanan, int Stok) {
		this.nama_makanan = namaMakanan;
		this.harga_makanan = hargaMakanan;
		this.stok = Stok;
	}
	
	public void TampilMakanan() {
		System.out.print(this.nama_makanan + "["+stok+"]"+"\tRp. "+harga_makanan);
	}
	
	public void kurangStok(int jumlah){
		this.stok = this.stok - jumlah;
	}
}

