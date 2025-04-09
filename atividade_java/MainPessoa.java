
public class MainPessoa {
    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "João";
        pessoa1.idade = 30;

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Maria";
        pessoa2.idade = 25;

        System.out.println("Informações da Pessoa 1:");
        pessoa1.mostrarInformacoes();

        System.out.println("\nInformações da Pessoa 2:");
        pessoa2.mostrarInformacoes();
    }
}
