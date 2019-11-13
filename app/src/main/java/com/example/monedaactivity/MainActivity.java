package com.example.monedaactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rbPAE, rbEAP;
    EditText edtValor;
    TextView txtResultado;
    Button btnCambio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rg = findViewById(R.id.rg);
        rbPAE = findViewById(R.id.rbPAE);
        rbEAP = findViewById(R.id.rbEAP);
        edtValor = findViewById(R.id.edtValor);
        btnCambio = findViewById(R.id.btnCambio);
        txtResultado = findViewById(R.id.txtResultado);

        btnCambio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double resultado;
                String sResult;
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                float valor = Float.parseFloat(edtValor.getText().toString());
                if (rbPAE.isChecked()){
                    resultado = valor*0.006;
                    sResult = valor + " pesetas " + getResources().getString(R.string.txt_cambio) + " " + resultado + "Euros";
                    i.putExtra("result", sResult);
                    startActivity(i);
                } else {
                    resultado = valor*166.386;
                    sResult = valor + " euros " + getResources().getString(R.string.txt_cambio) + " " + resultado + "Pesetas";
                    i.putExtra("result", sResult);
                    startActivity(i);
                }
            }
        });
    }
}
