public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) {
            this.nome = nome;
        } else {
            System.out.println("Erro: O nome não pode ser nulo ou vazio.");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            System.out.println("Erro: A quantidade não pode ser negativa.");
        }
    }
    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 1.00) {
            this.preco = preco;
        } else {
            System.out.println("Erro: O preço deve ser no mínimo R$ 1,00.");
        }
    }
    public void exibirInformacoes() {
        System.out.println("Informações do Produto");
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.printf("Preço: R$ %.2f%n", preco);
    }
}