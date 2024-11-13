package br.fsa.pessoas;

import java.util.Date;

/**
 * Classe que representa a pessoa física
 */

public abstract class Pessoa {

    protected String nome;
    protected Date dataNasc;
    protected String cep;
    protected String rua;
    protected String numero;
    protected String cidade;
    protected String estado;
    protected String telefone;
    protected String genero;
    protected String rg;
    protected String cpf;


    /**
     * Construtor padrão para inicializar a classe Pessoa
     */

    public Pessoa() {
        super();
    }

    /**
     * Construtor que inicializa a classe com as informações pessoais do indivíduo
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
     */

    public Pessoa(String nome, Date dataNasc, String cep, String rua, String numero, String cidade, String estado,
                  String telefone, String genero, String rg, String cpf) {
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.cep = cep;
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
        this.telefone = telefone;
        this.genero = genero;
        this.rg = rg;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNasc;
    }

    public void setDataNascimento(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
