
package com.mycompany.minggu5kasus2;

/**
 *
 * @author Gian Vilcan Patra
 */

public class Produk {
	private String namaItem;
	private int hargaItem;
	private int stokItem;
	private int id;
	private static int nextid =0;
	
	{
		this.id = nextid;
		nextid ++;
	}
	
	public String getNamaItem() {
		return namaItem;
	}
	public void setNamaItem(String namaItem) {
		this.namaItem = namaItem;
	}
	public int getHarga() {
		return hargaItem;
	}
	public void setHarga(int hargaItem) {
		this.hargaItem = hargaItem;
	}
	public int getStok() {
		return stokItem;
	}
	public void setStok(int stokItem) {
		this.stokItem = stokItem;
	}
	public int getId() {
		return id;
	}
	
	public Produk (String nama, int hargaItem, int stokItem) {
		this.namaItem = nama;
		this.stokItem = stokItem;
		this.hargaItem = hargaItem;
	}
	
	public void print() {
		System.out.println((this.id+1) + " " + this.namaItem + 
				" = Rp." + this.hargaItem + " (" + this.stokItem +")");
	}
        
}
