package com.example.aplikasipilihanmenu;

public class Menu {

    private String nama, harga, deskripsi;
    private int gambar;
    private double price;

    public Menu(String nama, String harga, String deskripsi, int gambar){//, double price) {
        this.nama = nama;
        this.harga = harga;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
//        this.price = price;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getHarga() {
        return harga;
    }

    public void setHarga(String harga) {
        this.harga = harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public int getGambar() {
        return gambar;
    }

    public void setGambar(int gambar) {
        this.gambar = gambar;
    }

//    public double getPrice(){return price;}
//
//    public void setPrice(double price){this.price = price;}
}
