package br.fsa.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe responsável por registrar mensagens de Log em txt
 */

public class Log {
    private String nomeArq;

    /**
     * Construtor da classe Log
     * 
     * @param nomeArq
     */

    public Log(String nomeArq) {
        this.nomeArq = nomeArq;
    }

    /**
     * Registra mensagem de erro no Log
     * @param mensagem
     */

    public void logErro(String mensagem) {
        String logMensagem = formatarMensagem("ERRO", mensagem);
        escreverArquivo(logMensagem);
    }

    /**
     * Registra uma informação no arquivo de Log
     * @param mensagem
     */

    public void logInfo(String mensagem){
        String logMensagem = formatarMensagem("INFO", mensagem);
        escreverArquivo(logMensagem);
    }

    /**
     * Formata a mensagem de log
     * @param tipo
     * @param mensagem
     * @return
     */

    private String formatarMensagem(String tipo, String mensagem) {
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dataAtual.format(formato) + " - " + tipo + " - " + mensagem;
    }

    /**
     * Escreve uma mensagem no arquivo de log
     * @param mensagem
     */

    private void escreverArquivo(String mensagem) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArq, true))){
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e){
            System.err.println("Erro ao escrever no arquivo LOG: " + e.getMessage());
        }
    }
}
