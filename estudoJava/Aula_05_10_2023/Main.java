package Aula_05_10_2023;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main (String[] args) {
//      Para armazenar os dados dos usuários será necessário criar uma nova array+list para que seja permitido a edição:
        ArrayList<PessoaFisica> listaPf = new ArrayList<>();
        ArrayList<PessoaJuridica> listaPj = new ArrayList<>();

//      Para manusear os metodos de calculo precisa ser chamado:
        PessoaFisica metodosPf = new PessoaFisica();
        PessoaJuridica metodosPj = new PessoaJuridica();

        System.out.println("Bem vindo ao sistema de cadastro de Pessoa Física e Pessoa Jurídica");

        Scanner scanner = new Scanner(System.in);

        int opcao;


        do {
            System.out.println("Escolha uma opção: ");
            System.out.println();
            System.out.println("1 - Pessoa Fisica / 2 - Pessoa Juridica / 0 - Sair");
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    int opcaopf;
                    do {
                        System.out.println("Escolha uma opção: 1 -  Cadastrar Pessoa Fisica / 2 - Listar Pessoa Fisica / 0 - Voltar ao menu anterior...");
                        opcaopf = scanner.nextInt();

                        switch (opcaopf) {
                            case 1:
//                                Instaciar um objeto , pegar a forma e todos os atributos para inputar a informação verdadeira
                                PessoaFisica novapf = new PessoaFisica();
                                Endereco novoEndPf = new Endereco();

//                                Solicitar uma informação para que o usuário input aquilo que está sendo solicitado:
                                System.out.println("Digite o nome da pessoa fisica: ");
//                                O retorno precisa ser armazenado:
                                novapf.nome = scanner.next();

                                System.out.println("Digite o seu CPF: ");
                                novapf.cpf = scanner.next();

                                System.out.println("Digite o rendimento mensal - Digite somento números");
                                novapf.rendimento = scanner.nextInt();

//                              Nosso usuario ira digitar manualmente / vamos validar pelo local Date se o usuario tem mais de 18 anos:
                                System.out.println("Digite a sua data de nascimento (dd/MM/yyyy): ");
//                              Recebe a informação / armazena e converte para pt-BR:
                                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
//                              Esta função pega o periodo (data atual) + anexa a data do nascimento (date/variavel) + data atual com o (LocalDate.now):
                                Period periodo = Period.between(date, LocalDate.now());

                                novapf.dataNascimento = date;

//                              Calculo para verificar a idade do usuário:
                                if (periodo.getYears() >= 18) {
                                    System.out.println("A pessoa tem mais de 18 anos.");
                                } else {
                                    System.out.println("A pessoa tem menos de 18 anos. Retornando ao menu...");
//                                  Para o sistema parar de rodar e voltar ao menu anterior digite:
                                    break;
                                }


                                System.out.println("Digite o logradouro: ");
                                novoEndPf.logradouro = scanner.next();

                                System.out.println("Digite o número: ");
                                novoEndPf.numero = scanner.next();

                                System.out.println("Este endereço é comercial? S/N: ");
                                String endCom;
                                endCom = scanner.next();
//                                Dentro do java é possivel a comparação dentro da resposta do usuário para determinar uma resposta boleana:
//                                equalsIgnoreCase - ignora se o usuário digitou em maiscula ou minuscula;
                                if (endCom.equalsIgnoreCase("S")) {
                                    novoEndPf.enderecoComercial = true;
                                } else {
                                    novoEndPf.enderecoComercial = false;
                                }
//                                colocar todas as informações que foram colocadas na variavel novoEndPf:
                                novapf.endereco = novoEndPf;

//                             Puxar a listaPf e adicionar todas:
                                listaPf.add(novapf);
                                System.out.println("Cadastro realizado com sucesso!");

                                break;
                            case 2:
                                //                    Comparação entre listas:
                                if (listaPf.size() > 0){
//                      for - cada opcao que tiver ele retorna de algum local:
                                    for (PessoaFisica cadaPf : listaPf){
//                              Pular uma linha:
                                        System.out.println();

                                        System.out.println("Nome: "+cadaPf.nome);

                                        System.out.println("CPF: "+cadaPf.cpf);
//                              Endereço definido como logradouro + n:
                                        System.out.println("Endereço: "+cadaPf.endereco.logradouro + ", " + cadaPf.endereco.numero);

                                        System.out.println("Data de Nascimento: "+cadaPf.dataNascimento.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
//                              Necessáriop puxar o metodo para depois puxar o calculo:
                                        System.out.println("Imposto a ser pago: "+ "R$"+ metodosPf.PagarImposto(cadaPf.rendimento));

                                        System.out.println();

                                        System.out.println("Digite 0 para continuar");
                                        scanner.nextLine();

                                    }

                                    opcaopf = scanner.nextInt();

                                }else {
                                    System.out.println("Lista vazia!");
                                }
                                break;
                            case 0:
                                System.out.println("Voltando ao menu anterior...");
                                break;
                            default:
                                System.out.println("Opção inválida, por favor digite uma opção válida!");
                                break;
                        }
                    } while (opcaopf != 0);


                    break;
                case 2:
                    int opcaopj;

                    do {
                        System.out.println("Escolha uma opção: 1 -  Cadastrar Pessoa Juridica / 2 - Listar Pessoa Juridica / 0 - Voltar ao menu anterior...");
                        opcaopj = scanner.nextInt();

                        switch (opcaopj) {
                            case 1:
                                PessoaJuridica novapj = new PessoaJuridica();
                                Endereco novoEndPj = new Endereco();

                                System.out.println("Digite a sua Razão Social: ");

                                novapj.razaoSocial = scanner.next();

                                System.out.println("Digite o seu CNPJ: ");
                                novapj.cnpj = scanner.next();

                                System.out.println("Digite o rendimento mensal - Digite somento números");
                                novapj.rendimento = scanner.nextInt();

                                System.out.println("Digite a data de abertura da empresa (dd/MM/yyyy): ");
                                LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                                Period periodo = Period.between(date, LocalDate.now());

                                novapj.dataAbertura = date;

//                              Calculo para verificar a idade da empresa:
                                if (periodo.getYears() >= 10) {
                                    System.out.println("A empresa tem mais de 10 anos no mercado");
                                } else {
                                    System.out.println("A empresa tem menos de 10 anos ...");
//                                  Para o sistema parar de rodar e voltar ao menu anterior digite:
                                    break;
                                }

                                System.out.println("Digite o logradouro: ");
                                novoEndPj.logradouro = scanner.next();

                                System.out.println("Digite o número: ");
                                novoEndPj.numero = scanner.next();

                                System.out.println("Este endereço é comercial? S/N: ");
                                String endCom;
                                endCom = scanner.next();
//                                Dentro do java é possivel a comparação dentro da resposta do usuário para determinar uma resposta boleana:
//                                equalsIgnoreCase - ignora se o usuário digitou em maiscula ou minuscula;
                                if (endCom.equalsIgnoreCase("S")) {
                                    novoEndPj.enderecoComercial = true;
                                } else {
                                    novoEndPj.enderecoComercial = false;
                                }

                                novapj.endereco = novoEndPj;

                                listaPj.add(novapj);
                                System.out.println("Cadastro realizado com sucesso!");


                                break;

                            case 2:

                                if (listaPj.size() >0){
                                    for (PessoaJuridica cadaPj: listaPj) {
                                            System.out.println();

                                        System.out.println("Razão Social: "+cadaPj.razaoSocial);

                                        System.out.println("CNPJ: "+ cadaPj.cnpj);

                                        System.out.println("Endereço: "+cadaPj.endereco.logradouro + ", " + cadaPj.endereco.numero);

                                        System.out.println("Data de abertura: "+cadaPj.dataAbertura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                                        System.out.println("Imposto a ser pago: "+ "R$"+ metodosPj.PagarImposto(cadaPj.rendimento));

                                        System.out.println();

                                        System.out.println("Digite 0 para continuar");
                                        scanner.nextLine();

                                        }
                                }else {
                                        System.out.println("Lista vazia!");
                                }

                                break;

                            case 0:
                                System.out.println("Voltando ao menu anterior...");
                                break;

                            default:
                                System.out.println("Opção inválida, por favor digite uma opção válida!");
                                break;
                        }
                    }while (opcaopj != 0);

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
