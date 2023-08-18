package com.example.aplikasipilihanmenu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<Menu> menuList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.rec_menu);
        MenuAdapter adapter = new MenuAdapter(menuList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);

        menuList.add(new Menu("Nama : Nasi Rendang", "Harga : ",26000, "Masakan daging yang berasal dari MinangKabau Sumatra Barat", R.drawable.rendang));
        menuList.add(new Menu("Nama : Nasi Limpa", "Harga : ",17000, "Rasanya yang enak dan lezat, gulai hati limpa sangan berguna bagi kesehatan", R.drawable.limpa));
        menuList.add(new Menu("Nama : Nasi Babat", "Harga : ",15000, "Gulai babat menggunakan bahan utama babat sapi yang dimasak dengan rempah-rempah khas", R.drawable.babat));
        menuList.add(new Menu("Nama : Nasi Kikil", "Harga : ",19000, "Kikil salah satu menu yang selalu ada di setiap rumah makan Padang", R.drawable.kikil));
    }
}