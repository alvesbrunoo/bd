public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Caderno");
        produto.setQuantidade(50);
        produto.setPreco(12.90);

        produto.exibirInformacoes();

        System.out.println("\n--- Testando com dados inválidos ---");

        produto.setNome("");             
        produto.setQuantidade(-5);       
        produto.setPreco(0.50);          
    }
}
