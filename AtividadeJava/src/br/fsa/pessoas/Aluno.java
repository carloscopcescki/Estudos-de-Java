package br.fsa.pessoas;

import java.util.Date;

/**
 * Classe que representa o aluno
 */

public class Aluno extends Pessoa {
    protected String curso;
    protected String codUnico;
    
    private static int ultimoCodigoGerado = 0;

    /**
     * Construtor padrão que inicializa a classe sem dados 
     */
    public Aluno() {
        super();
        this.codUnico = gerarCodigoUnico();
    }

    /**
     * Método construtor que inicializa aluno com as informações pessoais
     * @param nome
     * @param dataNasc
     * @param cep
     * @param rua
     * @param numero
     * @param cidade
     * @param estado
     * @param telefone
     * @param genero
     * @param rg
     * @param cpf
     * @param curso
     */

    public Aluno(String nome, Date dataNasc, String cep, String rua,
                 String numero, String cidade, String estado, String telefone, 
                 String genero, String rg, String cpf, String curso) {
        
        super(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf);
        this.curso = curso;
        this.codUnico = gerarCodigoUnico();
    }
    
    /**
     * Gera o código único para o aluno
     * @return
     */

    private String gerarCodigoUnico() {
        ultimoCodigoGerado++;
        return String.format("AL%05d", ultimoCodigoGerado);
    }

    /**
     * Retorna o curso que o aluno está graduando
     * @return
     */
    
     public String getCurso() {
        return curso;
    }

    /**
     * Define o curso que o aluno está graduando
     * @param curso
     */

    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Retorna o código único do aluno
     * @return
     */

    public String getCodUnico() {
        return codUnico;
    }

    /**
     * Representa a instância do aluno (contendo o nome, data de nascimento, código e curso)
     * 
     * @return 
     */

    @Override
    public String toString() {
        return "Aluno{" +
                "nome=" + getNome() +
                ", dataNasc=" + getDataNascimento() +
                ", codUnico='" + codUnico + '\'' +
                ", curso='" + curso + '\'' +
                '}';
    }
}
