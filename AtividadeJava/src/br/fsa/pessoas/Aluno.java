package br.fsa.pessoas;

import java.util.Date;

public class Aluno extends Pessoa {
    protected String curso;
    protected String codUnico;

    public Aluno(){
        super();
    }

    public Aluno(String nome, Date dataNasc, String cep, String rua,
                 String numero, String cidade, String estado, String telefone, String genero,
                 String rg, String cpf, String curso, String codUnico) {
        
        super(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf);
        this.curso = curso;
        this.codUnico = codUnico;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCodUnico(){
        return codUnico;
    }

    public void setCodUnico(String codUnico){
        this.codUnico = codUnico;
    }
}
