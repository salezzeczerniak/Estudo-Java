package Exercicios;

import java.util.Scanner;

public class PerimetroRetangulo {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);

        System.out.printf("Digite o comprimento do retângulo: ");

        double c = d.nextDouble();

        System.out.printf("Digite a largura deste retângulo: ");

        double l = d.nextDouble();

        double perimetro = 2*(c*l);

        System.out.printf("O perimetro deste retângulo é: "+perimetro);
    }
}
