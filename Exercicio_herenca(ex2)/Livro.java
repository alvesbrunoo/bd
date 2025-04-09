public class Livro extends Material {
    private int paginas;

    public Livro(String titulo, String autor, int paginas) {
        super(titulo, autor);
        this.paginas = paginas;
    }

    public void exibirInformacoes() {
        super.exibirInformacoes();
        System.out.println("Páginas: " + paginas);
    }
}
