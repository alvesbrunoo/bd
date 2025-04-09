public class Carro {
    private String marca;
    private String modelo;
    private double velocidadeAtual;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

 
    public void acelerar(double valor) {
        if (valor > 0) {
            velocidadeAtual += valor;
            if (velocidadeAtual > 200) {
                velocidadeAtual = 200;
            }
        }
    }

    public void frear(double valor) {
        if (valor > 0) {
            velocidadeAtual -= valor;
            if (velocidadeAtual < 0) {
                velocidadeAtual = 0;
            }
        }
    }


    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    
    public void exibirInformacoes() {
        System.out.println("=== Informações do Carro ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.printf("Velocidade Atual: %.2f km/h%n", velocidadeAtual);
    }
}
