import br.com.pessoa.modelo.Pessoa;
import br.com.pessoa.processamento.Escrever;
import br.com.pessoa.processamento.Ler;
import br.com.pessoa.processamento.Parse;

public class Main {

    public static void main(String[] args) {

        Parse parse = new Parse();
        parse.separandoAtributos();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("José");
        pessoa.setIdade(47);
        pessoa.setCPF("777.777.777-77");

        Escrever escrever = new Escrever();
        escrever.escreverNoArquivo(pessoa.getNome(), pessoa.getIdade(), pessoa.getCPF());

        System.out.println(new Ler().lerArquivo());
    }
}