package Exercicios;

import java.util.Scanner;

public class Atv06 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite um número de 1 à 10: ");
        int tabuada = leitor.nextInt();

        for (int i=0; i<10; i++){
            System.out.printf(tabuada + "x" + (i+1) + "=" + (tabuada * (i+1)+"\n"));
        }
    }
}
