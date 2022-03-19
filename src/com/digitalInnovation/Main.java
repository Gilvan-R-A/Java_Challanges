package com.digitalInnovation;

public class Main {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo(4d,2d);
        Retangulo retangulo2 = new Retangulo();
        retangulo2.setAltura(10d);
        retangulo2.setBase(20d);
        retangulo1.calcularArea();
        retangulo2.calcularArea();
        retangulo1.calcularPerimetro();
        retangulo2.calcularPerimetro();
        System.out.println(retangulo1);
        System.out.println(retangulo2);


    }
}
