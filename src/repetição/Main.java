package repetição;

public class Main {
    public static void main(String[] args) {
        String[] listaProfessores = {"Alana", "Aléxia", "Jéssica", "Odirlei", "Possarle", "Samanta", "Thiago"};

        for (int contador = 0; contador < listaProfessores.length; contador++) {
            System.out.println("O índice atual é " +contador);
            if (contador == 0){
                System.out.println("O número de indice do(a) professor(a) "+listaProfessores[contador]+ " é Zero");
            } else if (contador % 2 ==0) {
                System.out.println("O número de indice do(a) professor(a) "+listaProfessores[contador]+ " é par");
            }else {
                System.out.println("O número de indice do(a) professor(a) "+listaProfessores[contador]+ " é impar");
            }
        }

    }
}