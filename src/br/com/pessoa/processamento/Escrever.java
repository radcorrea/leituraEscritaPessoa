package br.com.pessoa.processamento;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class Escrever {

    private static final String PATH_ARQUIVO_LEITURA = "src/resource/arquivo.txt";

    public void escreverNoArquivo(String nome, int idade, String cpf) {

        String informacao = "\n" + nome + "," + idade + "," + cpf;

        try {
            Files.writeString(Path.of(PATH_ARQUIVO_LEITURA), informacao, StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException("Ocorreu um erro ao escrever no arquivo: " + e);
        }

    }
}
