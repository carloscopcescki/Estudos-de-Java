package br.fsa.dao;

import br.fsa.faculdade.Curso;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por implementar o método da interface LeitorArquivo
 * Referente a Curso
 */

public class CursoDAO extends BaseDAO<Curso>{

    /**
     * Método para salvar lista de cursos
     */
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
