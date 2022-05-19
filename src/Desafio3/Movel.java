package Desafio3;

public class Movel extends Produto{
    public Movel(String nome, double valor, int quantidade) {
        super(nome, valor, quantidade);
    }

    @Override
    public double calcularValorFinal() {
        float imposto = 0;
        if(getQuantidade() < 10){
            imposto = (float) 0.11;
        } else if (getQuantidade() >= 10){
            imposto = (float) 0.05;
        }
        double totalFinal = Math.round((getValor() * getQuantidade()) + ((getValor() * getQuantidade()) * imposto));
        return totalFinal;
    }
}
