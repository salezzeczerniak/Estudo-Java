package condicao;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite um número para verificar se é positivo ou negativo: ");

        int numero = leitor.nextInt();

        if (numero > 0 ) {
            System.out.printf("positivo");
        } else if (numero < 0 ) {
            System.out.printf("negativo");
        }else {
            System.out.printf("neutro");
        }
    }
}
