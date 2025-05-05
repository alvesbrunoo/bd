public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Camiseta", 10);

        try {
            produto.vender(5); 
            produto.vender(7); 
        } catch (EstoqueInsuficienteException e) {
            System.out.println("Erro na venda: " + e.getMessage());
        }
    }
}
