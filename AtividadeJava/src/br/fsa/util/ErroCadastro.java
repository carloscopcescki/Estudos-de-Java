package br.fsa.util;

/**
 * Classe que representa uma exceção para casos de erro durante o cadastro
 */

public class ErroCadastro extends Exception {

    /**
     * Construtor para erro de cadastro
     * 
     * Inicializa uma nova instância da exceção com uma mensagem
     * 
     * @param mensagem
     */

    public ErroCadastro(String mensagem){
        super(mensagem);
    }
}
