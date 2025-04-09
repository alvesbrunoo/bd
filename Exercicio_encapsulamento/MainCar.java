public class MainCar {
    public static void main(String[] args) {
        Carro carro = new Carro();

        carro.setMarca("Toyota");
        carro.setModelo("Corolla");

        carro.acelerar(50);
        carro.exibirInformacoes();

        System.out.println("\nAcelerando mais 180 km/h...");
        carro.acelerar(180); // Deve travar em 200 km/h
        carro.exibirInformacoes();

        System.out.println("\nFreando 100 km/h...");
        carro.frear(100);
        carro.exibirInformacoes();

        System.out.println("\nFreando mais 150 km/h...");
        carro.frear(150); 
        carro.exibirInformacoes();
    }
}

