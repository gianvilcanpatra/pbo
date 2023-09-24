
package com.mycompany.minggu5kasus2;

/**
 *
 * @author Gian Vilcan Patra
 */
import java.util.Scanner;

public class Utama {

    public static void main(String[] args) {
        Produk[] listProduk = generateProduk();
        Penjualan listPenjualan = new Penjualan();

        System.out.println("Daftar Menu Makanan");
        System.out.println("====================================");

        System.out.println("1. Ayam Goreng = Rp. 14000 (Stok: 20)");
        System.out.println("2. Pecel Lele = Rp. 12000 (Stok: 20)");
        System.out.println("3. Tahu = Rp. 1000 (Stok: 30)");
        System.out.println("4. Tempe = Rp. 1000 (Stok: 30)");
        System.out.println("5. Kol Goreng = Rp. 3000 (Stok: 10)");
        System.out.println("6. Nasi Putih = Rp. 5000 (Stok: 50)");
        System.out.println("7. Pecel Sapi = Rp. 25000 (Stok: 10)");
        System.out.println("8. Kopi = Rp. 4000 (Stok: 15)");
        System.out.println("9. Aqua = Rp. 3500 (Stok: 100)");
        System.out.println("10. Teh = Rp. 4000 (Stok: 20)");

        System.out.println("\n");

        Scanner scan = new Scanner(System.in);
        char pilihan = 'y';
        byte jumlahPembelian = 1;

        while ((pilihan == 'y' || pilihan == 'Y') && (jumlahPembelian <= 10)) {
            System.out.print("Masukkan Id Pilihan Makanan = ");
            int id = scan.nextInt();

            // Validasi ID produk yang valid (antara 1 dan 10)
            if (id < 1 || id > 10) {
                System.out.println("ID produk tidak valid. Harap masukkan ID antara 1 dan 10.");
                continue; // Mengulangi iterasi
            }

            System.out.print("Masukkan Jumlah Pembelian = ");
            int jumlah = scan.nextInt();

            // Validasi jumlah pembelian tidak melebihi stok
            if (jumlah > listProduk[id - 1].getStok()) {
                System.out.println("Maaf, jumlah pembelian melebihi stok yang tersedia. Melebihi Stok.");
                continue; // Mengulangi iterasi
            }

            String nama = listProduk[id - 1].getNamaItem();
            int harga = listProduk[id - 1].getHarga();
            listPenjualan.TambahPesanan(nama, jumlah, harga * jumlah);
            System.out.print("\nApakah akan memesan kembali 'y'= ");
            pilihan = scan.next().charAt(0);
            jumlahPembelian++;
        }
        listPenjualan.PesananSaya();
    }

    public static Produk[] generateProduk() {
        Produk[] listProduk = new Produk[10];
        String[] namaItem = {
            "ayam goreng", "pecel lele", "tahu", "tempe", "kol goreng", "nasi putih",
            "pecel sapi", "kopi", "aqua", "teh"
        };

        int[] hargaProduk = {
            14000, 12000, 1000, 1000, 3000, 5000, 25000, 4000, 3500, 4000
        };

        int[] stokProduk = {
            20, 20, 30, 30, 10, 50, 10, 15, 100, 20
        };

        for (int i = 0; i < 10; i++) {
            listProduk[i] = new Produk(namaItem[i], hargaProduk[i], stokProduk[i]);
        }

        return listProduk;
    }
}
