package br.com.pessoa.processamento;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ler {

    private static final String PATH_ARQUIVO_LEITURA = "src/resource/arquivo.txt";

    public String lerArquivo() {

        try {
            return Files.readString(Path.of(PATH_ARQUIVO_LEITURA), StandardCharsets.UTF_8);
        } catch (IOException e) {
            throw new RuntimeException("Ocorreu um erro ao ler o arquivo: " + e);
        }

    }
}
