package br.fsa.dao;

import br.fsa.faculdade.Materia;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por implementar o método da interface LeitorArquivo
 * Referente a Materia
 */

public class MateriaDAO extends BaseDAO<Materia> {

    /**
     * Método para salvar a lista de matérias
     */
    @Override
    public void salvarLista(List<Materia> lista){
        List<String> linhas = new ArrayList<>();
        for(Materia materia : lista){
            String linha = materia.getCurso() + ";" + materia.getCodigo() + ";" + materia.getListaNota();
            linhas.add(linha);
        }
        escreveArquivo(linhas);
    }
    
}
