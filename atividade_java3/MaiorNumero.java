import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número inteiro: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Digite o segundo número inteiro: ");
        int num2 = scanner.nextInt();
        
        if (num1 > num2) {
            System.out.println("O primeiro número (" + num1 + ") é maior.");
        } else if (num2 > num1) {
            System.out.println("O segundo número (" + num2 + ") é maior.");
        } else {
            System.out.println("Os números são iguais.");
        }
        
        scanner.close();
    }
}
