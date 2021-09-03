package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Longitud extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_longitud);


        Button Con=(Button)findViewById(R.id.Convertir1);



        Con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView M=(TextView)findViewById(R.id.Metros);
                float Mts=Float.parseFloat(M.getText().toString());
                Convertidor A=new Convertidor(Mts);

                RadioButton R1=(RadioButton)findViewById(R.id.Milimetros);
                RadioButton R2=(RadioButton)findViewById(R.id.Centimetros);
                RadioButton R3=(RadioButton)findViewById(R.id.Decimetros);
                RadioButton R4=(RadioButton)findViewById(R.id.Kilometros);

                if (R1.isChecked()){
                    Intent frmRes=new Intent(Longitud.this,Resultados.class);
                    frmRes.putExtra("res",A.Milimetros(A).toString()+"  Milimetros");
                    startActivity(frmRes);
                }else if (R2.isChecked()){
                    Intent frmRes=new Intent(Longitud.this,Resultados.class);
                    frmRes.putExtra("res",A.Centimetros(A).toString()+"  Centimetros");
                    startActivity(frmRes);
                }else if (R3.isChecked()){
                    Intent frmRes=new Intent(Longitud.this,Resultados.class);
                    frmRes.putExtra("res",A.Decimetros(A).toString()+"  Decimetros");
                    startActivity(frmRes);
                }else if (R4.isChecked()){
                    Intent frmRes=new Intent(Longitud.this,Resultados.class);
                    frmRes.putExtra("res",A.Kilometros(A).toString()+"  Kilometros");
                    startActivity(frmRes);
                }
            }
        });

    }
    public void regresar(View view){
        Intent Main = new Intent(Longitud.this,MainActivity.class);
        startActivity(Main);
    }




}
