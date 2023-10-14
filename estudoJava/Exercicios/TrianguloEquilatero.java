package Exercicios;

import java.util.Scanner;

public class TrianguloEquilatero {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite o lado do triangulo: ");
        double a = s.nextDouble();

        double area = (Math.sqrt(3)/4) * (a*a);

        System.out.printf("A área do trinagulo é: "+area);
    }
}
