package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pagina2(View view) {
        Intent i = new Intent(getApplicationContext(),segundolayaut.class);
        startActivity(i);
    }

    public void tercerapagina(View view) {
        Intent j = new Intent(getApplicationContext(),tercerlayaut.class);
        startActivity(j);
    }

    public void pagina4(View view) {
        Intent j = new Intent(getApplicationContext(),cuartolayaut.class);
        startActivity(j);
    }


}