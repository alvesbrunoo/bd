public class MainFuncionario {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Ana Silva");
        funcionario.adicionarHoras(8);
        funcionario.adicionarHoras(5);
        funcionario.exibirInformacoes();

        System.out.println("\nTentando adicionar horas inválidas...");
        funcionario.adicionarHoras(-3);  
        System.out.println("\nTotal de horas trabalhadas: " + funcionario.getHorasTrabalhadas());
    }
}
