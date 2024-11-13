package br.fsa.pessoas;

import java.util.Date;

public class Aluno extends Pessoa {
    protected String curso;
    protected String codUnico;
    
    private static int ultimoCodigoGerado = 0;

    public Aluno() {
        super();
        this.codUnico = gerarCodigoUnico();
    }

    public Aluno(String nome, Date dataNasc, String cep, String rua,
                 String numero, String cidade, String estado, String telefone, 
                 String genero, String rg, String cpf, String curso) {
        
        super(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf);
        this.curso = curso;
        this.codUnico = gerarCodigoUnico();
    }

    private String gerarCodigoUnico() {
        ultimoCodigoGerado++;
        return String.format("AL%05d", ultimoCodigoGerado);
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCodUnico() {
        return codUnico;
    }

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
