public class Carro extends Veiculo {
    public Carro(String marca, String modelo) {
        super(marca, modelo);
    }

    public void buzinar() {
        System.out.println("Bii Bii! (som de carro)");
    }
}
