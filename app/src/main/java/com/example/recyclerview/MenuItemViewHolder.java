package com.example.recyclerview;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuItemViewHolder extends RecyclerView.ViewHolder {

    TextView menuItemName,menuItemPrice;
    ImageView dogpic;
    int id;
    Context context;

    public MenuItemViewHolder(@NonNull final View itemView) {
        super(itemView);

        menuItemName = itemView.findViewById(R.id.item_name);
        menuItemPrice = itemView.findViewById(R.id.item_price);
        id = itemView.getId();
        dogpic = itemView.findViewById(R.id.dogpic);
        context = itemView.getContext();

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,Doggoindividual.class);
                String name = menuItemName.getText().toString();
                String breed = menuItemPrice.getText().toString();

                intent.putExtra("namekey",name);
                intent.putExtra("breedkey",breed);
                intent.putExtra("imageid",id);
                context.startActivity(intent);
            }
        });

    }

}
