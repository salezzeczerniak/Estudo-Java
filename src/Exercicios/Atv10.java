package Exercicios;

import java.util.Scanner;

public class Atv10 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o primeiro número: ");
        int primeiroNumero = leitor.nextInt(); ;

        System.out.printf("Digite o segundo número: ");
        int segundoNumero = leitor.nextInt();

        System.out.printf("");
        int media = ((primeiroNumero + segundoNumero) / 2);

        System.out.printf("A média dos números é: "+media);
    }
}
