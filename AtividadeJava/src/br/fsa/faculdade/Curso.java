package br.fsa.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    protected List<Materia> listaMaterias;
    protected String codigoUnico;

    public Curso(){
        this.listaMaterias = new ArrayList<>();
        this.codigoUnico = "";
    }

    public Curso(List<Materia> listaMaterias, String codigoUnico){
        this.listaMaterias = listaMaterias;
        this.codigoUnico = codigoUnico;
    }

    public List<Materia> getListaMaterias(){
        return listaMaterias;
    }

    public void setListaMaterias(List<Materia> listaMaterias){
        this.listaMaterias = listaMaterias;
    }

    public String getCodigo(){
        return codigoUnico;
    }

    public void setCodigo(String codigoUnico){
        this.codigoUnico = codigoUnico;
    }
}

