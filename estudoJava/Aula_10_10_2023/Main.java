package Aula_10_10_2023;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Livro> listaLivro = new ArrayList<>();

        System.out.println("Seja bem vindo ao sistema do Sebo!");

        Scanner scanner = new Scanner(System.in);

        int opcao;

        do {
            System.out.println("Escolha a sua opção: 1 - Cadastrar Livro / 2 - Listar livros já cadastrados / 0 - Sair");
            opcao = scanner.nextInt();
            System.out.println();


            switch (opcao) {
                case 1:

                    Livro novoLivro = new Livro();
                    Autor novoAutor = new Autor();

                    System.out.println("Digite o título deste livro: ");
                    novoLivro.titulo = scanner.next();

                    System.out.println("Digite o nome do autor: ");
                    novoAutor.nome = scanner.next();

                    System.out.println("Digite o local de nascimento do Autor: ");
                    novoAutor.localNasc = scanner.next();
                    System.out.println();


                    System.out.println("Digite o valor deste livro: ");
                    novoLivro.preco = scanner.nextFloat();

                    System.out.println("Digite a data de lançamento deste livro: ");
                    LocalDate date = LocalDate.parse(scanner.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                    Period periodo = Period.between(date, LocalDate.now());

                    novoLivro.dataLancamento = String.valueOf(date);

                    if (periodo.getYears() >= 5) {
                        System.out.println("Este livro tem mais de 5 anos, portante ele entrará em nosso sistema :)");
                    } else {
                        System.out.println("Este livro não possui pelo menos 5 anos, por isso não será possivel incluir em nosso sistema...");
                        break;
                    }


                    novoLivro.autor = novoAutor;

                    listaLivro.add(novoLivro);

                    System.out.println("Cadastro realizado com sucesso! :) ");
                    break;
                case 2:
                    if (listaLivro.size() > 0) {
                        for (Livro cadaLivro : listaLivro) {
                            System.out.println();
                            System.out.println("Título: " + cadaLivro.titulo);

                            System.out.println("Autor: " + cadaLivro.autor.nome);

                            System.out.println("Local de Nascimento do Autor: " + cadaLivro.autor.localNasc);

                            System.out.println("Data de lançamento: " + cadaLivro.dataLancamento);

                            System.out.println("Preço de custo: " + cadaLivro.preco);

                            System.out.println("Digite 0 para continuar");
                            scanner.nextLine();
                        }
                    } else {
                        System.out.println("Lista vazia!!");
                    }
                    break;
                case 0:
                    System.out.println("Sair...");
                    break;
                default:
                    System.out.println("Opção invalida, digite uma opção valida!");
                    break;
            }
        } while (opcao != 0);


    }

}


