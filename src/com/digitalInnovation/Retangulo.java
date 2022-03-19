package com.digitalInnovation;
/*
Crie uma classe que modele um retangulo:
Atributos: LadoA, LadoB (ou Comprimento e Largura, ou Base e Altura, a escolher).
Métodos: Mudar valor dos lados, Retornar valor dos lados, calcular Área e calcular Perímetro.
 */
public class Retangulo {

    private Double base;
    private Double altura;
    private Double area;
    private Double perimetro;

    public Retangulo() {

    }

    public Retangulo(Double base, Double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void calcularArea(){

        this.area = this.base * this.altura;
    }

    public void calcularPerimetro(){
        this.perimetro = 2 * (this.base + this.altura);
    }

    public Double getBase() {
        return base;
    }

    public void setBase(Double base) {
        this.base = base;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Retangulo{" +
                "base=" + base +
                ", altura=" + altura +
                ", area=" + area +
                ", perimetro=" + perimetro +
                '}';
    }
}
