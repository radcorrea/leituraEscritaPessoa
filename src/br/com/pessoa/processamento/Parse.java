package br.com.pessoa.processamento;

import br.com.pessoa.modelo.Pessoa;

public class Parse {

    private String[] informacoes;
    private String[] atributos;

    public void separandoAtributos() {
        Ler arquivo = new Ler();
        informacoes = arquivo.lerArquivo().split("\n");

        for(String informacao : informacoes) {
            atributos = informacao.split(",");
            Pessoa pessoa = new Pessoa();
            pessoa.setNome(atributos[0]);
            try {
                pessoa.setIdade(Integer.valueOf(atributos[1]));
            } catch (NumberFormatException e) {
                throw new RuntimeException("Problemas ao converter a idade para inteiro: " + e);
            }
            pessoa.setCPF(atributos[2]);
            pessoa.apresentarDados();
        }
    }

}
