public class Produto {
    private String nome;
    private int estoque;

    public Produto(String nome, int estoqueInicial) {
        this.nome = nome;
        this.estoque = estoqueInicial;
    }

    public void vender(int quantidade) throws EstoqueInsuficienteException {
        if (quantidade > estoque) {
            throw new EstoqueInsuficienteException(
                "Estoque insuficiente para o produto \"" + nome + "\". Estoque atual: " + estoque
            );
        }
        estoque -= quantidade;
        System.out.println("Venda realizada com sucesso! Estoque restante: " + estoque);
    }

    public int getEstoque() {
        return estoque;
    }
}
