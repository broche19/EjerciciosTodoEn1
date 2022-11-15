package com.example.actividadlayouts;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class tercerlayaut extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tercerlayaut);
    }

    public void mensajes(View view) {
        Toast toast1 =  Toast.makeText(getApplicationContext(),
                        "hola  ", Toast.LENGTH_SHORT);
        toast1.show();
    }
}