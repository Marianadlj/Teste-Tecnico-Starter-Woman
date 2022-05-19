package Desafio3;

public class Eletronico extends Produto{
    public Eletronico(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    @Override
    public double calcularValorFinal() {
        double totalFinal = Math.round((getValor() * getQuantidade()) + ((getValor() * getQuantidade()) * 0.15));
        return totalFinal;
    }
}
