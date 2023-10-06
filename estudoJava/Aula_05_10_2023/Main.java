package Aula_05_10_2023;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {

        System.out.println("Bem vindo ao sistema de cadastro de Pessoa Física e Pessoa Jurídica");

        Scanner scanner = new Scanner(System.in);

        int opcao = scanner.nextInt();

        do {
            System.out.println("Escolha uma opção: 1 - Pessoa Fisica / 2 - Pessoa Juridica / 0 - Sair");
            switch (opcao){
                case 1:
                    int opcaopf;
                    do {
                        System.out.println("Escolha uma opção: 1 -  Cadastrar Pessoa Fisica / 2 - Listar Pessoa Fisica / 0 - Voltar ao menu anterior...");
                        opcaopf = scanner.nextInt();

                        switch (opcaopf) {
                            case 1:
//                                Instaciar um objeto , pegar a forma e todos os atributos para inputar a informação verdadeira
                                PessoaFisica novapf = new PessoaFisica();

//                                Solicitar uma informação para que o usuário input aquilo que está sendo solicitado:
                                System.out.println("Digite o nome da pessoa fisica: ");
//                                O retorno precisa ser armazenado:
                                novapf.nome = scanner.next();

                                System.out.println("Digite o seu CPF: ");
                                novapf.cpf = scanner.next();

                                System.out.println("Digite o rendimento mensal - Digite somento números");
                                novapf.rendimento = scanner.nextInt();

                                System.out.println("Digite a sua data de nascimento (dd/MM/yyyy): ");
                                novapf.dataNascimento = scanner.next();

                                
                                break;
                            case 2:
                                break;
                            case 0:
                                System.out.println("Voltando ao menu anterior...");
                                break;
                            default:
                                System.out.println("Opção inválida, por favor digite uma opção válida!");
                                break;
                        }
                    }while (opcaopf != 0);

                }
                    break;
                case 2:
                    break;
                case 0:
                    System.out.println("Obrigado por utilizar o nosso sistema!");
                    break;
                default:
                    System.out.println("Opção inválida, por favor digite uma opção válida!");
                    break;
            }
        }while (opcao != 0);


    }
}
