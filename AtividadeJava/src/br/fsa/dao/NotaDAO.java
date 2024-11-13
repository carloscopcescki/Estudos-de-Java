package br.fsa.dao;

import br.fsa.faculdade.Nota;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por implementar o método da interface LeitorArquivo
 * Referente a Nota
 */

public class NotaDAO extends BaseDAO<Nota>{

    /**
     * Método para salvar lista de notas
     */
    @Override
    public void salvarLista(List<Nota> lista){
        List<String> linhas = new ArrayList<>();
        for(Nota nota : lista){
            String linha = nota.getP1() + ";" + nota.getP2() + ";" + nota.getTrabalho();
            linhas.add(linha);
        }
        escreveArquivo(linhas);
    }
}
