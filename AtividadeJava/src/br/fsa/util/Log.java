package br.fsa.util;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Log {
    private String nomeArq;

    public Log(String nomeArq) {
        this.nomeArq = nomeArq;
    }

    public void logErro(String mensagem) {
        String logMensagem = formatarMensagem("ERRO", mensagem);
        escreverArquivo(logMensagem);
    }

    public void logInfo(String mensagem){
        String logMensagem = formatarMensagem("INFO", mensagem);
        escreverArquivo(logMensagem);
    }

    private String formatarMensagem(String tipo, String mensagem) {
        LocalDateTime dataAtual = LocalDateTime.now();
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        return dataAtual.format(formato) + " - " + tipo + " - " + mensagem;
    }

    private void escreverArquivo(String mensagem) {
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArq, true))){
            writer.write(mensagem);
            writer.newLine();
        } catch (IOException e){
            System.err.println("Erro ao escrever no arquivo LOG: " + e.getMessage());
        }
    }
}
