public class Funcionario {
    private String nome;
    private int horasTrabalhadas;

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

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    private void setHorasTrabalhadas(int horas) {
        this.horasTrabalhadas = horas;
    }

    public void adicionarHoras(int horas) {
        if (horas > 0) {
            this.horasTrabalhadas += horas;
        } else {
            System.out.println("Erro: Só é possível adicionar horas positivas.");
        }
    }


    public void exibirInformacoes() {
        System.out.println("=== Informações do Funcionário ===");
        System.out.println("Nome: " + nome);
        System.out.println("Horas Trabalhadas: " + horasTrabalhadas);
    }
}
