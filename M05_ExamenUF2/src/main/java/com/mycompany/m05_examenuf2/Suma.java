package com.mycompany.m05_examenuf2;

public class Suma {
    // Definimos los atributos
    private int num1;
    private int num2;

    // Creamos el constructor
    public Suma(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Creamos el metodo Sumar
    public int Sumar() {
        return num1 + num2;
    }

    // Creamos el metodo getNum1
    public int getNum1() {
        return num1;
    }

    public double sumaValorAbsolut() {
        return Math.abs(num1) + Math.abs(num2);
    }
}
