package com.example.netapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText user, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user = (EditText) findViewById(R.id.usuario);
        pass = (EditText) findViewById(R.id.contra);
    }

    /*En este metodo se verifica que ingrese de manera correta usuario y contraseña, de se así
    * lo lleva a la actividad del menú*/
    public void Acceso (View view){
        if (user.getText().toString().isEmpty() || pass.getText().toString().isEmpty()){
            Toast toast = Toast.makeText(this, "Los campos no debe de estar vacíos",Toast.LENGTH_SHORT);
            toast.show();
        }else if (user.getText().toString() == "Admin" && pass.getText().toString() == "bros"){
            Toast toast = Toast.makeText(this,"Usuario o contraseña incorrectos",Toast.LENGTH_SHORT);
            toast.show();
        }else {
            Intent intent = new Intent(this,Menu.class);
            startActivity(intent);

        }
    }
}
