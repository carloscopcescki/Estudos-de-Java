package br.fsa.util;

public class Utilitarios {
    public static boolean verificaCPF(String cpf) {

        cpf = cpf.replaceAll("\\D", "");

        if (cpf.length() != 11) {
            return false;
        }

        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += (cpf.charAt(i) - '0') * (10 - i);
        }
        int primeiroDigitoVerificador = 11 - (soma % 11);
        if (primeiroDigitoVerificador >= 10) {
            primeiroDigitoVerificador = 0;
        }

        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += (cpf.charAt(i) - '0') * (11 - i);
        }
        int segundoDigitoVerificador = 11 - (soma % 11);
        if (segundoDigitoVerificador >= 10) {
            segundoDigitoVerificador = 0;
        }

        return (cpf.charAt(9) - '0') == primeiroDigitoVerificador &&
               (cpf.charAt(10) - '0') == segundoDigitoVerificador;
    }

    public static boolean validaTelefone(String telefone) {
        return telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}");
    }

    public static boolean validaEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}
