package br.fsa.dao;

import br.fsa.faculdade.Nota;
import java.util.ArrayList;
import java.util.List;

public class NotaDAO extends BaseDAO<Nota>{

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
