package training_springboot;

public class Produk {
    private String nama;
    private double harga;
    private int stok;

    //konstruktor
    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    //getter dan setter
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public int getStok() {
        return stok;
    }

    // getInfo
    public void ShowInfo() {
        System.out.println(nama + " - Rp " + harga + " ("+stok+" tersedia)");
    }

    public int decStok() {
        this.stok = this.stok - 1;
        return this.stok;
    }

}
