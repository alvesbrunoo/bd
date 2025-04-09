public class Revista extends Material {
    private int edicao;

    public Revista(String titulo, String autor, int edicao) {
        super(titulo, autor);
        this.edicao = edicao;
    }
}
    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Edição: " + edicao);
    }
}
