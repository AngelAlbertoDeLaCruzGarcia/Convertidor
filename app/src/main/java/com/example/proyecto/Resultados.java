package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Resultados extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
        recibedatos();

    }
    public void recibedatos() {
        Bundle extra = getIntent().getExtras();
        String res=extra.getString("res");
        TextView R1=(TextView)findViewById(R.id.txtRes);
        R1.setText(res);
    }
}
