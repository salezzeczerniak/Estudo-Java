package repeticao;

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int salario = 1000;

        while (salario < 5000) {
            salario += 100;

            System.out.println("O salario ainda é R$" + salario);

        }
        System.out.println("O salario final é R$" + salario);
    }
}
