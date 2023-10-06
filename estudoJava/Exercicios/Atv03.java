package Exercicios;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o primeiro número : ");
        int numero01 = leitor.nextInt();

        System.out.printf("Digite o segundo número : ");
        int numero02 = leitor.nextInt();

        int divisao = (numero01/numero02);

        System.out.printf("");
        System.out.printf("A divisão é : "+divisao);
    }
}
