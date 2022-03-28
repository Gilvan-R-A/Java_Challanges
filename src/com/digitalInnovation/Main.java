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

        System.out.println("---------------------");
        Quadrado quadrado1 = new Quadrado(5d);
        Quadrado quadrado2 = new Quadrado();
        quadrado2.setLado(15d);
        quadrado1.calcularArea();
        quadrado2.calcularArea();
        System.out.println(quadrado1);
        System.out.println(quadrado2);

        System.out.println("---------------------");

        BombaDeCombustivel bombaGasolina =
                new BombaDeCombustivel("Gasolina",
                        7.26,30000.00);

        System.out.println(bombaGasolina);
        bombaGasolina.abastecePorValor(50d);
        System.out.println("\n");
        System.out.println(bombaGasolina);
        bombaGasolina.abastecerPorLitro(30d);
        System.out.println("\n");

        System.out.println(bombaGasolina);








    }
}
