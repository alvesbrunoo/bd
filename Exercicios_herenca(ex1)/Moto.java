public class Moto extends Veiculo {
    public Moto(String marca, String modelo) {
        super(marca, modelo);
    }

    public void buzinar() {
        System.out.println("Beep Beep! (som de moto)");
    }
}
