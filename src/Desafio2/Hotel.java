package Desafio2;

public class Hotel {
    public static void main(String[] args){
        Hospedagem hospedagem = new Hospedagem(600);
        System.out.print("O valor da hospedagem normal em nosso hotel é: " + hospedagem.printValor());

        HospedagemVIP hospedagemvip = new HospedagemVIP(600);
        System.out.print("\nO valor da hospedagem vip em nosso hotel é: " + hospedagemvip.printValor());
    }
}
