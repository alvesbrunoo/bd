import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do array: ");
        int tamanho = scanner.nextInt();
        int[] numeros = new int[tamanho];
        
        System.out.println("Digite os elementos do array:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        
        System.out.println("A soma dos elementos do array é: " + soma);
        
        scanner.close();
    }
}
