package Exercicios;

import java.util.Scanner;

public class trianguloIsosceles {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.printf("Digite o comprimento do primeiro lado: ");
        double a = s.nextDouble();

        System.out.printf("Digite o comprimento do segundo lado: ");
        double b = s.nextDouble();

        double area = (b/4)*Math.sqrt((4*a*a)-(b*b));

        System.out.printf("A área do trinagulo isosceles é: "+area);
    }
}
