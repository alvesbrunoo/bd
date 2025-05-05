import java.io.*;

public class LeitorDeArquivo {
    public static void main(String[] args) {
        String conteudoSimulado = "Linha 1\nLinha 2\nLinha 3";
        BufferedReader leitor = null;

        try {
            leitor = new BufferedReader(new StringReader(conteudoSimulado));

            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            System.out.println("Erro na leitura: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("Referência não encontrada: " + e.getMessage());
        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                    System.out.println("Leitura finalizada.");
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o leitor: " + e.getMessage());
            }
        }
    }
}
