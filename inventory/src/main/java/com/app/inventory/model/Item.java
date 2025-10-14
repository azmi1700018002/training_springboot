package com.app.inventory.model;

public class Item {
    // atribut
    private Long id;
    private String nama;
    private int jumlah;
    private String lokasi;

    // konstruktor
    public Item(){}

    public Item(Long id, String nama, int jumlah, String lokasi) {
        this.id = id;
        this.nama = nama;
        this.jumlah = jumlah;
        this.lokasi = lokasi;
    }

    // getter dan setter
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getJumlah() {
        return jumlah;
    }
    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public String getLokasi() {
        return lokasi;
    }
    public void setLokasi(String lokasi) {
        this.lokasi = lokasi;
    }
    
}
