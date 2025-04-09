public class Main{
    public static void main(String[] args) {
        Veiculo carro = new Carro("Toyota", "Corolla");
        Veiculo moto = new Moto("Honda", "CB 500");

        System.out.println("Carro: ");
        carro.buzinar();

        System.out.println("Moto: ");
        moto.buzinar();
    }
}
