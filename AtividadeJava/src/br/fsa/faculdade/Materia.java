package br.fsa.faculdade;

import java.util.ArrayList;
import java.util.List;

/**
 * A classe representa a matéria associada a um curso da faculdade
 */

public class Materia {
    protected String curso;
    protected String codigoUnico;
    protected List<Nota> listaNotas;

    /**
     * Construtor padrão da classe Materia
     */

    public Materia(){
        this.curso = "";
        this.codigoUnico = "";
        this.listaNotas = new ArrayList<>();
    }

    /**
     * Construtor que inicializa os atributos da classe Materia
     * @param curso
     * @param codigoUnico
     * @param listaNotas
     */

    public Materia(String curso, String codigoUnico, List<Nota> listaNotas){
        this.curso = curso;
        this.codigoUnico = codigoUnico;
        this.listaNotas = listaNotas;
    }

    /**
     * Retorna o curso relacionado a materia
     * @return
     */

    public String getCurso(){
        return curso;
    }

    /**
     * Define o curso relacionado a materia
     * @param curso
     */

    public void setCurso(String curso){
        this.curso = curso;
    }

    /**
     * Retorna o código único da matéria
     * @return
     */

    public String getCodigo(){
        return codigoUnico;
    }

    /**
     * Define o código único da matéria
     * @param codigoUnico
     */

    public void setCodigo(String codigoUnico){
        this.codigoUnico = codigoUnico;
    }

    /**
     * Retorna a lista de notas da matéria
     * @return
     */

    public List<Nota> getListaNota(){
        return listaNotas;
    }

    /**
     * Define a lista de notas da respectiva matéria
     * @param listaNotas
     */

    public void setListaNota(List<Nota> listaNotas){
        this.listaNotas = listaNotas;
    }
}

