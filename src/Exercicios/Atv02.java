package Exercicios;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int numero01 = leitor.nextInt();
        System.out.printf("Digite o segundo número: ");
        int numero02 = leitor.nextInt();

        int soma = (numero01 + numero02);

        if (soma >= 100) {
            System.out.printf("A soma é maior que 100");
        }else {
            System.out.printf("A soma é menor que 100");
        }
    }
}
