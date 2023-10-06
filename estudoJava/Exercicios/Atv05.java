package Exercicios;

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int primeiroNumero = 125 + 24;
        int segundoNumero = 125 - 24;
        int terceiroNumero = 125*24;
        int quartoNumero = 125/24;
        int quintoNumero = 125 % 24;

        System.out.printf("");
        System.out.printf("O primeiro calulo é: "+primeiroNumero+"\n");
        System.out.printf("O segundo calculo é: "+segundoNumero+"\n");
        System.out.printf("O terceiro calculo é: "+terceiroNumero+"\n");
        System.out.printf("O quarto calculo é: "+quartoNumero+"\n");
        System.out.printf("O quinto calculo é: "+quintoNumero+"\n");

    }
}
