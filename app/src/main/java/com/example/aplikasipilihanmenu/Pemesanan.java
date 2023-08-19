package com.example.aplikasipilihanmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class Pemesanan extends AppCompatActivity {

    private Button btn_pesan;
    private TextView nama_pesan, harga_pesan, quantity_pesan, total_pesan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pemesanan);

        String namaPesan = getIntent().getStringExtra("namaMenu");
        int hargaPesan = getIntent().getIntExtra("nominalMenu", 0);
        int quantityPesan = getIntent().getIntExtra("quantity", 0);
        int totalPesan = getIntent().getIntExtra("price", 0);

        nama_pesan = findViewById(R.id.nama_pesan);
        harga_pesan = findViewById(R.id.harga_pesan);
        quantity_pesan = findViewById(R.id.quantity_pesan);
        total_pesan = findViewById(R.id.total_pesan);

        nama_pesan.setText(namaPesan);
        harga_pesan.setText(String.valueOf("Harga : "+hargaPesan));
        quantity_pesan.setText(String.valueOf(quantityPesan));
        total_pesan.setText(String.valueOf("Total : "+totalPesan));

        btn_pesan = findViewById(R.id.btn_pesan);
        btn_pesan.setOnClickListener(V -> {
            startActivity(new Intent(Pemesanan.this, MainActivity.class));
        });
    }
}