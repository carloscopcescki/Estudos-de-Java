/**
 * Classe responsável por realizar a leitura e salvar a lista de objetos em CSV
 */

package br.fsa.dao;

import java.util.List;

public interface LeitorArquivo {
    void setArquivo(String fileName);
    void escreveArquivo(List<String> linhas);
    List<String> leArquivo();
}
