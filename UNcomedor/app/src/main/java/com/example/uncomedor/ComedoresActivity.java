package com.example.uncomedor;

import static com.example.uncomedor.MainActivity.pila;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ComedoresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comedores);
    }

    public void iraComedor(View view) {
        pila.push(ComedorActivity.class);
        Intent siguiente = new Intent(this, ComedorActivity.class);
        this.startActivity(siguiente);
    }
}