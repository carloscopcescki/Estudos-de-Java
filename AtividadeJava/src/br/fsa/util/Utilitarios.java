package br.fsa.util;

/**
 * Classe utilitária, usada para validação de dados
 */

public class Utilitarios {

    /**
     * Realiza a verificação do CPF
     * @param cpf
     * @return
     */

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

    /**
     * Valida o formato de número do telefone
     * @param telefone
     * @return
     */

    public static boolean validaTelefone(String telefone) {
        return telefone.matches("\\(\\d{2}\\) \\d{4,5}-\\d{4}");
    }

    /**
     * Valida o formato do endereço de e-mail
     * @param email
     * @return
     */

    public static boolean validaEmail(String email) {
        return email.matches("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
    }
}
