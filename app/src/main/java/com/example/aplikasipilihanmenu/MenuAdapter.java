package com.example.aplikasipilihanmenu;

import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.ViewHolder> {
    private List<Menu> menuList;

    public MenuAdapter(List<Menu> menuList){

        this.menuList = menuList;
    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        public TextView namaMenu, hargaMenu, nominalMenu, deskripsiMenu;
        public ImageView gambarMenu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            namaMenu = (TextView) itemView.findViewById(R.id.nama_menu);
            hargaMenu = (TextView) itemView.findViewById(R.id.harga_menu);
            nominalMenu = (TextView) itemView.findViewById(R.id.nominal_menu);
            deskripsiMenu = (TextView) itemView.findViewById(R.id.deskripsi_menu);
            gambarMenu = (ImageView) itemView.findViewById(R.id.gambar_menu);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int position = getAdapterPosition();
                    Menu menu = menuList.get(position);

                    Intent intent = new Intent(view.getContext(), Detail.class);
                    intent.putExtra("namaMenu", menu.getNama());
                    intent.putExtra("hargaMenu", menu.getHarga());
                    intent.putExtra("deskripsiMenu", menu.getDeskripsi());
                    intent.putExtra("gambarMenu", menu.getGambar());
                    intent.putExtra("nominalMenu", menu.getNominal());
                    view.getContext().startActivity(intent);
                }
            });
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_makanan, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Menu menu = menuList.get(position);
        holder.namaMenu.setText(menu.getNama());
        holder.hargaMenu.setText(menu.getHarga());
        holder.nominalMenu.setText(String.valueOf(menu.getNominal()));
        holder.deskripsiMenu.setText(menu.getDeskripsi());
        holder.gambarMenu.setImageResource(menu.getGambar());


    }

    @Override
    public int getItemCount() {
        return menuList.size();
    }
}
