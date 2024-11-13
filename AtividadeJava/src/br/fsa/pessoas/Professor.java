package br.fsa.pessoas;

import java.util.Date;
import java.util.List;

/**
 * Classe que representa o professor
 */

public class Professor extends Pessoa{
    protected List<String> listaMaterias;
    protected String codUnico;

    /**
     * Construtor padrão para inicializar a classe
     */

    public Professor(){
        super();
    }

    /**
     * Construtor que inicializa a classe com as informações pessoais do professor
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
     * @param listaMaterias
     * @param codUnico
     */

    public Professor(String nome, Date dataNasc, String cep, String rua,
                 String numero, String cidade, String estado, String telefone, String genero,
                 String rg, String cpf, List<String> listaMaterias, String codUnico){
        super(nome, dataNasc, cep, rua, numero, cidade, estado, telefone, genero, rg, cpf);
        this.listaMaterias = listaMaterias;
        this.codUnico = codUnico;
    }

    /**
     * Retorna a lista de matérias que o professor leciona
     * 
     * @return 
     */

    public List<String> getListaMaterias(){
        return listaMaterias;
    }

    /**
     * Define a lista de matérias que o professor leciona
     * 
     * @param listaMaterias
     */

    public void setListaMaterias(List<String> listaMaterias){
        this.listaMaterias = listaMaterias;
    }

    /**
     * Retorna o código do professor
     * 
     * @return
     */

    public String getCodUnico(){
        return codUnico;
    }
    
    /**
     * Define o código do professor
     * 
     * @param codUnico
     */
    
    public void setCodUnico(String codUnico){
        this.codUnico = codUnico;
    }
}
