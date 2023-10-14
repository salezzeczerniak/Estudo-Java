package Exercicios;

import java.util.Scanner;

public class Atv11 {
    public static void main (String[] args){
        int a, b, tempo;

        a = 15;
        b = 27;

        System.out.printf("Before swapping: a,b = "+a+", "+ + b +"\n");
        tempo = a;
        a = b;
        b = tempo;

        System.out.printf("After swapping: a, b = "+a+", "+ + b);
    }
}

