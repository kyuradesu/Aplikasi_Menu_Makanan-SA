package com.example.aplikasipilihanmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private Button btn_minus, btn_tambah, btn_order;
    private TextView txt_quantity, txt_total;
    private int quantity = 0;
    int price = 3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btn_minus = findViewById(R.id.btn_minus);
        btn_tambah = findViewById(R.id.btn_tambah);
        btn_order = findViewById(R.id.btn_order);
        txt_quantity = findViewById(R.id.txt_quantity);
        txt_total = findViewById(R.id.txt_total);

        uptadetotal();




        btn_minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (quantity > 0){
                    quantity--;
                    uptadetotal();
                }
            }
        });

        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                quantity++;
                uptadetotal();
            }
        });


        TextView namaDetail = findViewById(R.id.nama_detail);
        TextView hargaDetail = findViewById(R.id.harga_detail);
        TextView deskripsiDetail = findViewById(R.id.deskripsi_detail);
        ImageView gambarDetail = findViewById(R.id.gambar_detail);
//        TextView price = findViewById(R.id.price);


        String namaMenu = getIntent().getStringExtra("namaMenu");
        String hargaMenu = getIntent().getStringExtra("hargaMenu");
        String deskripsiMenu = getIntent().getStringExtra("deskripsiMenu");
        int gambarMenu = getIntent().getIntExtra("gambarMenu", 0);
//        String pricemenu = getIntent().getStringExtra("pricemenu");



        namaDetail.setText(namaMenu);
        hargaDetail.setText(hargaMenu);
        deskripsiDetail.setText(deskripsiMenu);
        gambarDetail.setImageResource(gambarMenu);
//        price.setText(pricemenu);





    }

    private void uptadetotal() {
        txt_quantity.setText(String.valueOf(quantity));
        int total = quantity * price;
        txt_total.setText("Rp. : " + total);
    }

}