package com.example.aplikasipilihanmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    private Button btn_minus, btn_tambah, btn_order;
    private TextView txt_quantity, txt_total;
    int quantity = 0;
    int price = 0, harga;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        btn_minus = findViewById(R.id.btn_minus);
        btn_tambah = findViewById(R.id.btn_tambah);
        btn_order = findViewById(R.id.btn_order);
        txt_quantity = findViewById(R.id.txt_quantity);
        txt_total = findViewById(R.id.txt_total);



        btn_minus.setOnClickListener(V ->{
            kurang();
        });
        btn_tambah.setOnClickListener(V ->{
            tambah();
        });



        TextView namaDetail = findViewById(R.id.nama_detail);
        TextView hargaDetail = findViewById(R.id.harga_detail);
        TextView nominalDetail = findViewById(R.id.nominal_detail);
        TextView deskripsiDetail = findViewById(R.id.deskripsi_detail);
        ImageView gambarDetail = findViewById(R.id.gambar_detail);



        String namaMenu = getIntent().getStringExtra("namaMenu");
        String hargaMenu = getIntent().getStringExtra("hargaMenu");
        int nominalMenu = getIntent().getIntExtra("nominalMenu", 0);
        String deskripsiMenu = getIntent().getStringExtra("deskripsiMenu");
        int gambarMenu = getIntent().getIntExtra("gambarMenu", 0);



        namaDetail.setText(namaMenu);
        hargaDetail.setText(hargaMenu);
        nominalDetail.setText(String.valueOf(nominalMenu));
        deskripsiDetail.setText(deskripsiMenu);
        gambarDetail.setImageResource(gambarMenu);



        btn_order.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Detail.this, Pemesanan.class);

                intent.putExtra("namaMenu", namaMenu);
                intent.putExtra("nominalMenu", nominalMenu);
                intent.putExtra("price", price);
                intent.putExtra("quantity", quantity);

                startActivity(intent);
            }
        });


    }

    private void tambah() {
        quantity = quantity+1;
        harga = getIntent().getIntExtra("nominalMenu", 0);
        price = quantity * harga;

        txt_total.setText(String.valueOf("Rp. : " +price));
        txt_quantity.setText(String.valueOf(quantity));
    }

    private void kurang() {
        if (quantity != 0) {
            quantity = quantity - 1;
            harga = getIntent().getIntExtra("nominalMenu", 0);
            price = quantity * harga;
        }
        txt_total.setText(String.valueOf("Rp. : " +price));
        txt_quantity.setText(String.valueOf(quantity));
    }

}