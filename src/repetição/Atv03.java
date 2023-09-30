package repetição;

import java.util.Scanner;

public class Atv03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int numero;

        do {
            System.out.println("Digite um numero: ");
            numero = leitor.nextInt();


        }while (numero!= 0);
    }
}
