package com.example.aplikasipilihanmenu;

public class Menu {

    private String nama, harga, deskripsi;
    private int nominal, gambar;

    public Menu(String nama, String harga, int nominal, String deskripsi, int gambar){
        this.nama = nama;
        this.harga = harga;
        this.nominal = nominal;
        this.deskripsi = deskripsi;
        this.gambar = gambar;
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

    public int getNominal(){return nominal;}
    public void setNominal(int nominal){this.nominal = nominal;}

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

}
