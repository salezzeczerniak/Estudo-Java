package Exercicios;

import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);

        System.out.printf("Digite o raio do seu circulo: ");
        double r = s.nextDouble();
        double area = (22*r*r)/7;
        System.out.printf("A área do circulo é: "+area);
        /*Para obter a área de um círculo, devemos definir a fórmula que, como sabemos, consiste em A = r2 π.
        Além disso, atribuímos o valor de 22/7 ao símbolo grego de "pi".
        O "Import" é uma palavra-chave com a qual podemos obter certas características das pacotes integrados. Aqui usamos o pacote "util" que inclui muitas classes. Uma dessas classes é "Scanner", que usamos para obter comandos através do console. Lembre-se de que o console é a interface entre o usuário e o programa.
        Em seguida, podemos ver a função principal que já explicamos em detalhes no "public static void main".
        A classe scanner é responsável pela digitalização dos dados de entrada fornecidos pelo usuário através do console. Devemos criar um objeto que seja a referência para armazenar a variável "s". (Para ter acesso ao console, devemos criar um objeto "new scanner ").
        Agora com System.out.println ("Enter the radius:"); pedimos o valor do raio que o usuário entra pelo teclado.
        Usamos o "nextdouble", pois este é o formato que precisamos para que o console leia o número que estamos inserindo. Além disso, como o número de pi é um número com decimais, é necessário usar "nextdouble" em vez de "nextint" (um formato que não aceita decimais, mas apenas números inteiros).*/
    }
}
