package br.fsa.pessoas;

import java.util.Date;
import java.util.List;

public class Professor extends Pessoa{
    protected List<String> listaMaterias;
    protected String codUnico;

    public Professor(){
        super();
    }

    public Professor(String nome, Date dataNasc, String cep, String rua,
                 String numero, String cidade, String estado, String telefone, String genero,
                 String rg, String cpf, List<String> listaMaterias, String codUnico){
        super(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf);
        this.listaMaterias = listaMaterias;
        this.codUnico = codUnico;
    }

    public List<String> getListaMaterias(){
        return listaMaterias;
    }

    public void setListaMaterias(List<String> listaMaterias){
        this.listaMaterias = listaMaterias;
    }

    public String getCodUnico(){
        return codUnico;
    }
    
    public void setCodUnico(String codUnico){
        this.codUnico = codUnico;
    }
}
