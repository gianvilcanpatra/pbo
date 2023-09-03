/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gradingnilai;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.Scanner;

public class Gradingnilai {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // Input nilai tugas, UTS, dan UAS
        System.out.print("Masukkan nilai tugas: ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double nilaiUAS = input.nextDouble();
        
        // Persentase bobot nilai
        double bobotTugas = 0.20;
        double bobotUTS = 0.35;
        double bobotUAS = 0.45;
        
        double nilaiAkhirSebelumPembulatan = (nilaiTugas * bobotTugas) 
               + (nilaiUTS * bobotUTS) + (nilaiUAS * bobotUAS);
        
        // Memeriksa apakah nilaiAkhir memiliki koma dan membulatkannya jika iya
        double nilaiAkhirSetelahPembulatan = nilaiAkhirSebelumPembulatan;
        if (nilaiAkhirSetelahPembulatan % 1 != 0) {
            nilaiAkhirSetelahPembulatan = Math.round(nilaiAkhirSetelahPembulatan);
        }
        
        // Menampilkan hasil sebelum dan sesudah pembulatan
        System.out.println("Nilai Akhir (Sebelum Pembulatan): " + nilaiAkhirSebelumPembulatan);
        System.out.println("Nilai Akhir (Sesudah Pembulatan): " + nilaiAkhirSetelahPembulatan);
        
        // Menentukan grade
        String grade = "";
        if (nilaiAkhirSetelahPembulatan >= 85) {
                grade = "A";
        } else if (nilaiAkhirSetelahPembulatan >= 75 
                && nilaiAkhirSetelahPembulatan <= 84) {
                grade = "B";
        } else if (nilaiAkhirSetelahPembulatan >= 65 
                && nilaiAkhirSetelahPembulatan <= 74) {
                grade = "C";
        } else if (nilaiAkhirSetelahPembulatan >= 49 
                && nilaiAkhirSetelahPembulatan <= 64) {
                grade = "D";
        } else {
                grade = "E";
        }
        
        System.out.println("Grade: " + grade);
        
        // Menutup scanner
        input.close();
    }
}
