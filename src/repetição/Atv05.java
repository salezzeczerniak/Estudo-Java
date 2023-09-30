package repetição;

import java.util.Scanner;

public class Atv05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        String [] listaCarros = {"Fiesta", "Onix", "Fusca", "Saveiro", "Meriva"};

        for (String carro: listaCarros){
            System.out.println("O carro atual é: " + carro);
        }
    }
}
