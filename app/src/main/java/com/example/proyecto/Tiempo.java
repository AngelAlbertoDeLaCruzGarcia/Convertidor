package com.example.proyecto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Tiempo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tiempo);
        Button Con=(Button)findViewById(R.id.Enviar2);

        Con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView T=(TextView)findViewById(R.id.Horas);
                float Hrs=Float.parseFloat(T.getText().toString());
                Convertidor A=new Convertidor(Hrs);

                RadioButton R1=(RadioButton)findViewById(R.id.Segundo);
                RadioButton R2=(RadioButton)findViewById(R.id.Minuto);
                RadioButton R3=(RadioButton)findViewById(R.id.Dia);
                RadioButton R4=(RadioButton)findViewById(R.id.Semana);

                if (R1.isChecked()){
                    Intent frmRes=new Intent(Tiempo.this,Resultados.class);
                    frmRes.putExtra("res",A.Segundos(A).toString()+"  Segundos");
                    startActivity(frmRes);
                }else if (R2.isChecked()){
                    Intent frmRes=new Intent(Tiempo.this,Resultados.class);
                    frmRes.putExtra("res",A.Minutos(A).toString()+"  Minutos");
                    startActivity(frmRes);
                }else if (R3.isChecked()){
                    Intent frmRes=new Intent(Tiempo.this,Resultados.class);
                    frmRes.putExtra("res",A.Dias(A).toString()+"  Dias");
                    startActivity(frmRes);
                }else if (R4.isChecked()){
                    Intent frmRes=new Intent(Tiempo.this,Resultados.class);
                    frmRes.putExtra("res",A.Semanas(A).toString()+"  Semanas");
                    startActivity(frmRes);
                }
            }
        });
    }
    public void regresar(View view){
        Intent Main = new Intent(Tiempo.this,MainActivity.class);
        startActivity(Main);
    }
}
