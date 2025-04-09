public class Main {
    public static void main(String[] args) {
        Material livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 1200);
        Material revista = new Revista("National Geographic", "Vários", 202);
        Material dvd = new DVD("Interstellar", "Christopher Nolan", 169);

        System.out.println("Informações do Livro:");
        livro.exibirInformacoes();
        System.out.println();

        System.out.println("Informações da Revista:");
        revista.exibirInformacoes();
        System.out.println();

        System.out.println("Informações do DVD:");
        dvd.exibirInformacoes();
    }
}
