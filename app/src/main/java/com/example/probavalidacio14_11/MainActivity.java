package com.example.probavalidacio14_11;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button botoLogin= findViewById(R.id.btnLogin);
        EditText text1  = findViewById(R.id.nom);
        botoLogin.setOnClickListener(v -> {
            String str = text1.getText().toString();
            Intent intent = new Intent(getApplicationContext(), Segona_Pantalla.class);
            intent.putExtra("message_key", str);
            startActivity(intent);
        });
    }


        }

