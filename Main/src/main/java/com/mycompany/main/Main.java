/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.main;

/**
 *
 * @author Gian Vilcan Patra
 */
public class Main {

     public static void main(String[] args) {
        TokoGame pesanan1 = new TokoGame("Gian", "One Piece 4", 500000, 2);
        pesanan1.BuatPesanan();

        TokoGame pesanan2 = new TokoGame("Alucard", "Cyberpunk 2077", 450000, 1);
        pesanan2.BuatPesanan();
    }
}
