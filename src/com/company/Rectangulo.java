package com.company;

public class Rectangulo {
    int b;
    int a;

    public Rectangulo(int b, int a) {
        this.b = b;
        this.a = a;
    }

    private int getAltura(){
        return getAltura();
    }
    private int getBase(){
        return getBase();
    }
    public int obtenerPerimetro(){
        return getBase() * 2 + getAltura() * 2;
    }
    public int obtenerArea(){
        return getBase() * getAltura();
    }
}
