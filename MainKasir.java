package training_springboot;

import java.util.ArrayList;
import java.util.Scanner;

public class MainKasir {
    public static void main(String[] args) {
        // buat inputan menggunakan scanner
        Scanner input = new Scanner(System.in);

        // buat daftar produk
        ArrayList<Produk> daftarProduk = new ArrayList<>();
        // isikan produknya
        daftarProduk.add(new Produk("Bayam", 2000, 10));
        daftarProduk.add(new Produk("Pepaya", 3000, 10));
        daftarProduk.add(new Produk("Jengkol", 4000, 10));
        daftarProduk.add(new Produk("Tempe", 1500, 10));

        //buat transaksi
        Transaksi trx = new Transaksi();

        // munculkan menu
        System.out.println("===Kasir BPD DIY===");
        boolean belanja = true;
        while(belanja){
            System.out.println("Daftar Produk: ");
            for (Produk p : daftarProduk) {
                p.ShowInfo();
            }

            // intruksi user
            System.out.println("\nMasukkan nama produk (atau ketik selesai'):");
            String namaProduk = input.nextLine();

            // cocokan
            if (namaProduk.equalsIgnoreCase("selesai")) {
                belanja = false;
            }else{
                System.out.println("Masukkan jumlah:");
                int jml = Integer.parseInt(input.nextLine());
                // cari produk menggunakan arraylist
                Produk ditemukan = null;
                for (Produk p : daftarProduk) {
                    if (p.getNama().equalsIgnoreCase(namaProduk)) {
                        ditemukan = p;
                        break;
                    }
                }

                // jika produk ditemukan
                if (ditemukan != null) {
                    trx.tambahKeranjang(ditemukan, jml);
                } else {
                    System.out.println("Produk tidak ditemukan");
                }
            }
        }

        // tampilkan hasil
        trx.tampilTotalHarga();
        System.out.println("Terima kasih telah berbelanja di Toko BPD DIY");
        input.close();
    }
        
}
