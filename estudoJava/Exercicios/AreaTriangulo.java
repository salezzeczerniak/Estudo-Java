package Exercicios;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite a largura do triangulo: ");
        double b= s.nextDouble();

        System.out.printf("Digite a altura do triangulo: ");
        double h = s.nextDouble();

        //Cálculo da área:

        double area = (b*h)/2;
        System.out.printf("A área do triangulo é: " +area);
    }
}
