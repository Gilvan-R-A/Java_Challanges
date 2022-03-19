package com.digitalInnovation;

/*Crie uma classe que modele um quadrado:
        Atributos:Tamanho do lado.
        Métodos:Mudar valor do Lado,retornar valor do lado e calcular área.*/

public class Quadrado {

    private Double lado;
    private Double area;

    public Quadrado() {

    }

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public void calcularArea(){
        this.area = this.lado * this.lado;
    }

    public Double getLado() {
        return lado;
    }

    public void setLado(Double lado) {
        this.lado = lado;
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + lado +
                ", area=" + area +
                '}';
    }
}
