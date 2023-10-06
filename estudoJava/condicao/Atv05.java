package condicao;

import java.util.Date;
import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o seu ano de nascimneto: ");
        int anoNascimento = leitor.nextInt();
        System.out.printf("Digite em que ano estamos: ");
        int anoAtual = leitor.nextInt();
        int idade = anoAtual - anoNascimento;

        if (idade > 18){
            System.out.printf("Você é maior de 18 anos!");

        }else {
            System.out.printf("Você é menor de 18 anos :(");
        }
    }
}
