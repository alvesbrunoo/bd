import java.util.Scanner;

public class Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a nota (0 a 100): ");
        int nota = scanner.nextInt();
        
        char classificacao;
        
        if (nota >= 90) {
            classificacao = 'A';
        } else if (nota >= 80) {
            classificacao = 'B';
        } else if (nota >= 70) {
            classificacao = 'C';
        } else if (nota >= 60) {
            classificacao = 'D';
        } else {
            classificacao = 'E';
        }
        
        System.out.println("Classificação: " + classificacao);
        
        scanner.close();
    }
}