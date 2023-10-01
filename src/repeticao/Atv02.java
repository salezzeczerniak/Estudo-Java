package repeticao;

import java.util.Scanner;

public class Atv02 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int listaSenha;


        do {
            System.out.println("Digite a sua senha: ");
            listaSenha = leitor.nextInt();

            if (listaSenha != 123){
                System.out.println("Senha incorreta");
            }
        }while (listaSenha != 123);

        System.out.println("Senha correta!");
    }
}


