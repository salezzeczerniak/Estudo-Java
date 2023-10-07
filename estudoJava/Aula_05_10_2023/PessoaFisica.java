package Aula_05_10_2023;

import java.time.LocalDate;

public class PessoaFisica extends Pessoa {
    public String cpf;
    public LocalDate dataNascimento;

    public float PagarImposto(float rendimento) {
        if (rendimento <= 1500) {
            return 0;
        } else if (rendimento > 1500 && rendimento <= 3500) {
            float resultado = (rendimento / 100) * 2;
            return resultado;
        } else if (rendimento > 3500 && rendimento <= 6000) {
            float resultado = (rendimento / 100) * 3.5f;
        } else {
            float resultado = (rendimento / 100) * 5;
            return resultado;
        }
        return rendimento;
    }
}
