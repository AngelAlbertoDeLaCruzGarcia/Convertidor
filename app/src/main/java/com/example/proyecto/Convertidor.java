package com.example.proyecto;

public class Convertidor {
    private double M;
    //Longitud
    private double C;
    private double mili;
    private double deci;
    private double Ki;
    //Tiempo
    private double Segundo;
    private double Minuto;
    private double Dia;
    private double Semana;


    public double getM() {
        return M;
    }

    public double getC() {
        return C;
    }

    public void setM(float m) {
        M = m;
    }

    public void setC(float c) {
        C = c;
    }

    public Convertidor(double M){
        this.M=M;
        this.C=100;
        this.mili=1000;
        this.deci=10;
        this.Ki=0.001;

        this.Segundo=3600;
        this.Minuto=60;
        this.Dia=0.0416666667;
        this.Semana=0.00595238095;
    }

    public Convertidor(Convertidor obj){
        this.M=obj.M;
        this.C=obj.C;
    }

    @Override
    public String toString() {
        return " ="  + M ;
    }

    //Longitud

    public Convertidor Centimetros(Convertidor A){
        double CE=this.M*this.C;
        Convertidor R=new Convertidor(CE);
        return R;
    }

    public Convertidor Milimetros(Convertidor A){
        double Mi=this.M*this.mili;
        Convertidor R=new Convertidor(Mi);
        return R;
    }

    public Convertidor Decimetros(Convertidor A){
        double dec=this.M*this.deci;
        Convertidor R=new Convertidor(dec);
        return R;
    }

    public Convertidor Kilometros(Convertidor A){
        double kilo=this.M*this.Ki;
        Convertidor R=new Convertidor(kilo);
        return R;
    }

    //Tiempo

    public Convertidor Segundos(Convertidor A){
        double Seg=this.M*this.Segundo;
        Convertidor R=new Convertidor(Seg);
        return R;
    }
    public Convertidor Minutos(Convertidor A){
        double Min=this.M*this.Minuto;
        Convertidor R=new Convertidor(Min);
        return R;
    }
    public Convertidor Dias(Convertidor A){
        double Di=this.M*this.Dia;
        Convertidor R=new Convertidor(Di);
        return R;
    }
    public Convertidor Semanas(Convertidor A){
        double Sem=this.M*this.Semana;
        Convertidor R=new Convertidor(Sem);
        return R;
    }
}
