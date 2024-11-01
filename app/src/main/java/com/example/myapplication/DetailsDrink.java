package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class DetailsDrink extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main3);
        Intent intent = getIntent();
        int id = (int)intent.getExtras().get("drink_id");

        Drinks drink = Drinks.drinks[id];

        ImageView image = (ImageView)findViewById(R.id.coffee_image);
        image.setImageResource(drink.getImageResourceId());

        TextView txtName= (TextView)findViewById(R.id.txtName);
        TextView txtDesc= (TextView)findViewById(R.id.txtDesc);

        txtName.setText(drink.getName());
        txtDesc.setText(drink.getDescription());
    }
}