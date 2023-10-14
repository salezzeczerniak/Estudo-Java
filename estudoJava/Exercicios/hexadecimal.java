package Exercicios;

import java.util.Scanner;

public class hexadecimal {
    public static void main(String[] args) {

        int decimal_num, rem;
        String hexdecimal_num = "";

        char hex[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};

        Scanner in = new Scanner(System.in);

        System.out.printf("Digite o número decimal: ");
        decimal_num = in.nextInt();

        while (decimal_num >0){
            rem = decimal_num%16;
            hexdecimal_num = hex[rem] + hexdecimal_num;
            decimal_num = decimal_num/16;
        }
        System.out.printf("O número digitado em hexadecimal é: "+hexdecimal_num+"\n");
    }
}
