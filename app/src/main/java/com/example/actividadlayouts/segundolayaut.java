package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class segundolayaut extends AppCompatActivity {

    EditText n1;
    EditText n2;

    TextView resultado;

    //@SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundolayaut);

        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.num2);
        resultado=findViewById(R.id.resultado);

    }


    public void sumas(View view) {
       resultado.setText(String.valueOf(Integer.parseInt(n1.getText().toString())+ Integer.parseInt(n2.getText().toString())))  ;


    }

    public void restar(View view) {
        resultado.setText(String.valueOf(Integer.parseInt(n1.getText().toString())- Integer.parseInt(n2.getText().toString())));
    }

    public void division(View view) {
        resultado.setText(String.valueOf(Integer.parseInt(n1.getText().toString())/ Integer.parseInt(n2.getText().toString())));

    }

    public void multiplicacion(View view) {
        resultado.setText(String.valueOf(Integer.parseInt(n1.getText().toString())* Integer.parseInt(n2.getText().toString())));

    }
}