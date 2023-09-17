/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inventori;

/**
 *
 * @author Gian Vilcan Patra
 */

public class Barang {
    String kode_barang;
    String nama_barang;
    int stok;

    public Barang(String kode, String nama, int stk) {
        kode_barang = kode;
        nama_barang = nama;
        stok = stk;
}
    
    public int getStok(){
            return stok;
}
}
