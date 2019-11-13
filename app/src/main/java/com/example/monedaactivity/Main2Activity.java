package com.example.monedaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView txtRespuesta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtRespuesta = findViewById(R.id.txtRespuesta);

        Intent i = getIntent();
        txtRespuesta.setText(i.getStringExtra("result"));
    }
}
