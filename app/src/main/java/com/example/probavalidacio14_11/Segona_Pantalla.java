package com.example.probavalidacio14_11;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.probavalidacio14_11.databinding.ActivitySegonaPantalla2Binding;

public class Segona_Pantalla extends AppCompatActivity {

   // private AppBarConfiguration appBarConfiguration;
    private ActivitySegonaPantalla2Binding binding;
    TextView msgAltrePantalla;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        msgAltrePantalla = findViewById(R.id.textImportat);
        Intent intent = getIntent();
        String str = intent.getStringExtra("message_key");
        msgAltrePantalla.setText(str);


        binding = ActivitySegonaPantalla2Binding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.toolbar);



    }


}