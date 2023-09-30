package condicao;

import java.util.Scanner;

public class Atv01 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        int primeiraNota = leitor.nextInt();
        System.out.println("Digite a segunda nota: ");
        int segundaNota = leitor.nextInt();

        int media = (primeiraNota + segundaNota) / 2;

        if (media >= 6){
            System.out.println("Meus parabéns");
        }else {
            System.out.println("Você não passou. Estude um pouco mais!");
        }
    }
}
