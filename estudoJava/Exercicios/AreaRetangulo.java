package Exercicios;

import java.util.Scanner;

public class AreaRetangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite o comprimento: ");
        double c = s.nextDouble();

        System.out.printf("Digite a largura: ");
        double l = s.nextDouble();

        double area = c*l;
        System.out.printf("A área do retângulo é: "+area);

    }
}
