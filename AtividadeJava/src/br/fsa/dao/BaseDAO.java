package br.fsa.dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public abstract class BaseDAO<T> implements LeitorArquivo {
    protected String arquivo;

    @Override
    public void setArquivo(String fileName){
        this.arquivo = fileName;
    }

    @Override
    public void escreveArquivo(List<String> linhas) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(arquivo))) {
            for (String linha : linhas) {
                writer.write(linha);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public abstract void salvarLista(List<T> lista);

    @Override
    public List<String> leArquivo(){
        return null;
    }
}
