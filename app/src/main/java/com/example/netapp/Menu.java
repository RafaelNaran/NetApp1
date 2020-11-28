package com.example.netapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        //Probando Cambios
    }

    public void agenda (View view){
        Intent intent = new Intent(this,AgendaM.class);
        startActivity(intent);

    }

    public void configR(View view) {
        Intent intent = new Intent(this,ConfigRed.class);
        startActivity(intent);
    }
}
