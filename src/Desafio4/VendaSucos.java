package Desafio4;

import java.util.Objects;
import java.util.Scanner;

public class VendaSucos {
    public static void main(String[] args){
        double desconto = 0;
        int valorSucoLimao = 3;
        int valorSucoTamarindo = 2;
        double conta = 0;

        Scanner tipo = new Scanner(System.in);
        System.out.print("Que sabor você gostaria? Digite 'L' para limão e 'T' para tamarindo: \n");
        String sabor = tipo.nextLine();

        Scanner quantidade = new Scanner(System.in);
        System.out.print("Quanto de suco, em litros, você gostaria? \n");
        int litros = quantidade.nextInt();

        if(Objects.equals(sabor, "L") || Objects.equals(sabor, "T")){
            if(Objects.equals(sabor, "L") && litros <= 2){
                desconto = (litros * valorSucoLimao) * 0.03;
                conta = (litros * valorSucoLimao) - desconto;
            } else if (Objects.equals(sabor, "L") && litros >= 5){
                desconto = (litros * valorSucoLimao) * 0.05;
                conta = (litros * valorSucoLimao) - desconto;
            } else if (Objects.equals(sabor, "T") && litros <= 2){
                desconto = (litros * valorSucoTamarindo) * 0.04;
                conta = (litros * valorSucoTamarindo) - desconto;
            } else if (Objects.equals(sabor, "T") && litros >= 5){
                desconto = (litros * valorSucoTamarindo) * 0.06;
                conta = (litros * valorSucoTamarindo) - desconto;
            }
        } else {
            System.out.print("Sabor indisponível!");
        }
        System.out.print("Sua conta total foi: " + conta + " e seu desconto total foi de: " + desconto);

    }
}
