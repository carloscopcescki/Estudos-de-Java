package br.fsa.dao;

import br.fsa.pessoas.Aluno;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO extends BaseDAO<Aluno>{

    @Override
    public void salvarLista(List<Aluno> lista){
        List<String> linhas = new ArrayList<>();
        for (Aluno aluno : lista){
            String linha = aluno.getNome() + ";" + aluno.getDataNascimento() + ";" + aluno.getCep() + ";" + aluno.getRua() + ";" + aluno.getNumero()
                + ";" + aluno.getTelefone() + ";" + aluno.getGenero() + ";" + aluno.getRg() + ";" + aluno.getCpf()
                + ";" + aluno.getCurso() + ";" + aluno.getCodUnico();
            linhas.add(linha);
        }
        escreveArquivo(linhas);
    }
}
