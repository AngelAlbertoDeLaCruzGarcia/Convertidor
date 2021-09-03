package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Enviar1=(Button) findViewById(R.id.Enviar);

        Enviar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                RadioButton R2=(RadioButton)findViewById(R.id.Radio2);

                RadioButton R4=(RadioButton)findViewById(R.id.Radio4);

                if (R2.isChecked()){
                    Intent Longi = new Intent(MainActivity.this, Longitud.class);
                    startActivity(Longi);
                }else if (R4.isChecked()){
                    Intent Time=new Intent(MainActivity.this,Tiempo.class);
                    startActivity(Time);
                }
            }
        });

    }
}
