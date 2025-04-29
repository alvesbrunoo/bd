import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LeitorDeArquivo {
    public static void main(String[] args) {
        BufferedReader leitor = null;

        try {
            // Caminho do arquivo (você pode mudar para um arquivo real no seu sistema)
            String caminhoArquivo = "exemplo.txt";
            leitor = new BufferedReader(new FileReader(caminhoArquivo));
            
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado: " + e.getMessage());

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());

        } catch (NullPointerException e) {
            System.out.println("Erro: referência nula ao acessar o arquivo.");

        } finally {
            try {
                if (leitor != null) {
                    leitor.close();
                    System.out.println("Arquivo fechado com sucesso.");
                }
            } catch (IOException e) {
                System.out.println("Erro ao fechar o arquivo: " + e.getMessage());
            }
        }
    }
}
