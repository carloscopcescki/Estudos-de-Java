package br.fsa.faculdade;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    protected String curso;
    protected String codigoUnico;
    protected List<Nota> listaNotas;

    public Materia(){
        this.curso = "";
        this.codigoUnico = "";
        this.listaNotas = new ArrayList<>();
    }

    public Materia(String curso, String codigoUnico, List<Nota> listaNotas){
        this.curso = curso;
        this.codigoUnico = codigoUnico;
        this.listaNotas = listaNotas;
    }

    public String getCurso(){
        return curso;
    }

    public void setCurso(String curso){
        this.curso = curso;
    }

    public String getCodigo(){
        return codigoUnico;
    }

    public void setCodigo(String codigoUnico){
        this.codigoUnico = codigoUnico;
    }

    public List<Nota> getListaNota(){
        return listaNotas;
    }

    public void setListaNota(List<Nota> listaNotas){
        this.listaNotas = listaNotas;
    }
}

