package condicao;

import java.util.Scanner;

public class Atv04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.printf("Digite o nome do usuário? ");
        String usuario = leitor.next();
        System.out.printf("Digite a sua senha: ");
        String senha = leitor.next();

        if (usuario == "admin" && senha == "senha123"){
            System.out.printf("Login bem sucedido!");
        }else {
            System.out.printf("Nome de usuário ou senha incorreta.");
        }
    }
}
