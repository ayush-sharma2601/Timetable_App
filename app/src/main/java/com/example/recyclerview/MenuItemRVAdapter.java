package com.example.recyclerview;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MenuItemRVAdapter extends RecyclerView.Adapter<MenuItemViewHolder> {

    //fields
    ArrayList<MenuItem> itemList;
    Context context;

    //constructor

    public MenuItemRVAdapter(ArrayList<MenuItem> itemList, Context context) {
        this.itemList = itemList;
        this.context = context;
    }

    @NonNull
    @Override
    public MenuItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.menu_item_layout,parent,false);
        MenuItemViewHolder viewHolder = new MenuItemViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MenuItemViewHolder holder, int position) {

        holder.menuItemName.setText(itemList.get(position).getName());
        holder.menuItemPrice.setText(itemList.get(position).getBreed());
        holder.dogpic.setImageResource(itemList.get(position).getImageid());
        holder.id = itemList.get(position).getImageid();

    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
