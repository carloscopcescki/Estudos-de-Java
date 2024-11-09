package br.fsa.dao;

import br.fsa.faculdade.Materia;
import java.util.ArrayList;
import java.util.List;

public class MateriaDAO extends BaseDAO<Materia> {

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
