package Desafio1;

import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {

        int count = 0;
        boolean numeroErrado = true;

        while (numeroErrado){
            Scanner ler = new Scanner(System.in);
            System.out.println("Digite um número entre 1000 e 9999: \n");
            int num = ler.nextInt();

            int[] digits = Integer.toString(num).chars().map(c -> c-'0').toArray();
            int tamanho = digits.length;

            if(num >= 1000 && num <= 9999){
                for(int d : digits){
                    if(d % 2 == 0) {
                        count++;
                    }
                }
                System.out.print("Existem " + count + " números pares no número digitado!");
                numeroErrado = false;
            } else if (tamanho <= 3){
                    System.out.println("Você digitou um número com 3 dígitos ou menos! É preciso digitar um com 4 dígitos, tente novamente.");
            } else {
                System.out.println("Você digitou um número inválido, tente novamente!");
            }
        }

    }
}
