package br.fsa.dao;

import br.fsa.pessoas.Professor;
import java.util.ArrayList;
import java.util.List;

public class ProfessorDAO extends BaseDAO<Professor> {

    @Override
    public void salvarLista(List<Professor> lista){
        List<String> linhas = new ArrayList<>();
        for (Professor professor : lista) {
            String linha = professor.getNome() + ";" + professor.getDataNascimento() + ";" + professor.getCep() + ";" + professor.getRua() + ";" + professor.getNumero()
                + ";" + professor.getTelefone() + ";" + professor.getGenero() + ";" + professor.getRg() + ";" + professor.getCpf()
                + ";" + professor.getListaMaterias() + ";" + professor.getCodUnico();
            linhas.add(linha);
        }
        escreveArquivo(linhas);
    }
}
