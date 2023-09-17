/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Gian Vilcan Patra
 */
public class TokoGame {
    private String namaPembeli;
    private String judulGame;
    private double hargaGame;
    private int jumlahGame;
    private double totalHarga;

    public TokoGame(String namaPembeli, String judulGame, double hargaGame, int jumlahGame) {
        this.namaPembeli = namaPembeli;
        this.judulGame = judulGame;
        this.hargaGame = hargaGame;
        this.jumlahGame = jumlahGame;
        this.totalHarga = hargaGame * jumlahGame;
    }

    public String getNamaPembeli() {
        return namaPembeli;
    }

    public void setNamaPembeli(String namaPembeli) {
        this.namaPembeli = namaPembeli;
    }

    public String getJudulGame() {
        return judulGame;
    }

    public void setJudulGame(String judulGame) {
        this.judulGame = judulGame;
    }

    public double getHargaGame() {
        return hargaGame;
    }

    public void setHargaGame(double hargaGame) {
        this.hargaGame = hargaGame;
    }

    public int getJumlahGame() {
        return jumlahGame;
    }

    public void setJumlahGame(int jumlahGame) {
        this.jumlahGame = jumlahGame;
        this.totalHarga = hargaGame * jumlahGame;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void BuatPesanan() {
        System.out.println("=====================================");
        System.out.println("Pembeli       : " + this.namaPembeli);
        System.out.println("Judul Game    : " + this.judulGame);
        System.out.println("Harga Game    : " + this.hargaGame);
        System.out.println("Jumlah Game   : " + this.jumlahGame);
        System.out.println("Total Harga   : " + this.totalHarga);
        System.out.println("=====================================");
    }
}
