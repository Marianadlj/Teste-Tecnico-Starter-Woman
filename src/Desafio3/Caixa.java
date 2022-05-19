package Desafio3;

import java.util.ArrayList;

public class Caixa {
    public static <listaProdutos> void main(String[] args){
        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Eletronico("Ventilador", 320,3));
        listaProdutos.add(new Eletronico("Computador", 3999,2));
        listaProdutos.add(new Movel("Mesa", 270,2));
        listaProdutos.add(new Produto("Caderno", 10.50,10));
        listaProdutos.add(new Movel("Cadeira", 234.25,2));
        listaProdutos.add(new Produto("Caneta", 0.70,15));

        for (Produto produto: listaProdutos) {
            System.out.println("Nome: "+ produto.getNome() + " Quantidade: " + produto.getQuantidade() + " Valor: " + produto.getValor() + " Valor final: " + produto.calcularValorFinal());
            System.out.println("====================================");
            }
    }
}

//neste desafio não fiz o uso da função, acabei preferindo fazer assim.
