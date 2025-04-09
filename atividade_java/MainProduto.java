public class MainProduto {
    public static void main(String[] args) {
        Produto produto1 = new Produto();
        Produto produto2 = new Produto();

        produto1.nome = "Notebook";
        produto1.preco = 3000.00;
        produto1.quantidade = 5;

        produto2.nome = "Smartphone";
        produto2.preco = 1500.00;
        produto2.quantidade = 10;

        double valorTotalProduto1 = produto1.calcularValorTotal();
        double valorTotalProduto2 = produto2.calcularValorTotal();

        System.out.println("Valor total em estoque do " + produto1.nome + ": R$ " + valorTotalProduto1);
        System.out.println("Valor total em estoque do " + produto2.nome + ": R$ " + valorTotalProduto2);
    }
}
