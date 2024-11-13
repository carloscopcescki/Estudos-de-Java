package br.fsa.dao;

import br.fsa.pessoas.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável por implementar o método da interface LeitorArquivo
 * Referente a Aluno
 */

public class AlunoDAO extends BaseDAO<Aluno>{

    /**
     * Método para salvar a lista de alunos
     */
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
