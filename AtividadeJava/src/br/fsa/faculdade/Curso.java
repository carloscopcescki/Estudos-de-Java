package br.fsa.faculdade;

import java.util.List;

/**
 * A classe representa os cursos da faculdade, contendo a lista de matérias e o código de cada um
 */

public class Curso {
    protected List<Materia> listaMaterias;
    protected String codigoUnico;

    /**
     * Construtor padrão do Curso
     * 
     * @param cursos
     * @param codigoCurso
     */

    public Curso(List<Materia> listaMaterias, String codigoUnico){
        this.listaMaterias = listaMaterias;
        this.codigoUnico = codigoUnico;
    }
    
    /**
     * Retorna a lista de matérias
     * 
     * @return
     */

    public List<Materia> getListaMaterias(){
        return listaMaterias;
    }

    /**
     * Define a lista de matérias do curso
     * @param listaMaterias
     */

    public void setListaMaterias(List<Materia> listaMaterias){
        this.listaMaterias = listaMaterias;
    }

    /**
     * Retorna o código único do curso
     * 
     * @return
     */

    public String getCodigo(){
        return codigoUnico;
    }

    /**
     * Define o código único do curso
     * 
     * @param codigoUnico
     */

    public void setCodigo(String codigoUnico){
        this.codigoUnico = codigoUnico;
    }
}

