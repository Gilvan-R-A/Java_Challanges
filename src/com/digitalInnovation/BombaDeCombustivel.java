package com.digitalInnovation;
/*
Crie uma classe que modele uma bomba de combustível.
Atributos: tipo de combustível, valor do litro, quantidade do combustível.
Métodos:
- Abastecer por valor: método onde é informado o valor a ser abastecido e
mostra a quantidade de litros que foi colocada no veículo.
- Abastecer por litro: método onde é informado a quantidade em litros de
 combustível e mostra o valor a ser pago pelo cliente.
- Alterar o valor do litro do combustível: altera o valor do litro do
combustível.
- Alterar quantidade de combustível: altera a quantidade de combustível
 restante na bomba.
  Sempre que acontecer um abastecimento é necessário atualizar a quantidade
   de combustível total na bomba. A bomba inicia com 100 L de combustível.
*/
public class BombaDeCombustivel {

    private String tipoCombustivel;
    private Double valorLitro;
    private Double quantidadeCombustivel;


    public BombaDeCombustivel(String tipoCombustivel, Double valorLitro, Double quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorLitro = valorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }

    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public Double getValorLitro() {
        return valorLitro;
    }

    public void setValorLitro(Double valorLitro) {
        this.valorLitro = valorLitro;
    }

    public Double getQuantidadeCombustivel() {
        return quantidadeCombustivel;
    }

    public void setQuantidadeCombustivel(Double quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

    @Override
    public String toString() {
        return "BombaDeCombustivel{" +
                "tipoCombustivel='" + tipoCombustivel + '\'' +
                ", valorLitro=" + valorLitro +
                ", quantidadeCombustivel=" + quantidadeCombustivel +
                '}';
    }
}
