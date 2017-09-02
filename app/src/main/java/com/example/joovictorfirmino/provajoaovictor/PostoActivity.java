package com.example.joovictorfirmino.provajoaovictor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.os.Bundle;
import android.app.*;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.*;
import android.view.*;

public class PostoActivity extends AppCompatActivity {

    EditText edtAlcool;
    EditText edtGasolina;
    EditText edtResultado;
    Button btnCalcular;
    double num1;
    double num2;
    double result;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_posto);

        edtAlcool = (EditText) findViewById(R.id.edtAlcool);
        edtGasolina = (EditText) findViewById(R.id.edtGasolina);
        btnCalcular = (Button) findViewById(R.id.btnCalcular);
        edtResultado = (EditText) findViewById(R.id.edtResultado);

        btnCalcular.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                num1 = Double.parseDouble(edtAlcool.getText().toString());
                num2 = Double.parseDouble(edtGasolina.getText().toString());
                result = num1 / num2;
                edtResultado.setText(String.valueOf(result));

            }
        });

    }

}

