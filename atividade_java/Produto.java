public class Produto {
    String nome;
    double preco;
    int quantidade;
    public double calcularValorTotal() {
        return preco * quantidade;
    }
}
