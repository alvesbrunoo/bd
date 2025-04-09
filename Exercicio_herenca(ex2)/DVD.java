public class DVD extends Material {
    private int duracao;

    public DVD(String titulo, String autor, int duracao) {
        super(titulo, autor);
        this.duracao = duracao;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Duração: " + duracao + " minutos");
    }
}
