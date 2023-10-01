package condicao;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.printf("Digite um número de 1 a 7: ");
        int numero = leitor.nextInt();


        String dia = null; 

        switch (numero) {
            case 1:
                dia = "segunda-feira";
                break;
            case 2:
                dia = "terça-feira";
                break;
            case 3:
                dia = "quarta-feira";
                break;
            case 4:
                dia = "quinta-feira";
                break;
            case 5:
                dia = "sexta-feira";
                break;
            case 6:
                dia = "sabado";
                break;
            case 7:
                dia = "domingo";
                break;
            default:
                System.out.printf("Digito inválido. Digite um número de 1 a 7!!");
        }
        System.out.printf("O número "+numero+ " corresponde há " + dia);
    }

}
