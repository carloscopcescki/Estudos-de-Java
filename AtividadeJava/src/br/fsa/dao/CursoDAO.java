package br.fsa.dao;

import br.fsa.faculdade.Curso;
import java.util.ArrayList;
import java.util.List;

public class CursoDAO extends BaseDAO<Curso>{

    @Override
    public void salvarLista(List<Curso> lista){
        List<String> linhas = new ArrayList<>();
        for(Curso curso : lista) {
            String linha = curso.getListaMaterias() + ";" + curso.getCodigo();
            linhas.add(linha);
        }
        escreveArquivo(linhas);
    }
}
