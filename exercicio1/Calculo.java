import java.util.Scanner;

public class Calculo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite o primeiro número: ");
            double numero1 = Double.parseDouble(scanner.nextLine());

            System.out.print("Digite o segundo número: ");
            double numero2 = Double.parseDouble(scanner.nextLine());

            double resultado = numero1 / numero2;
            System.out.println("Resultado: " + resultado);

        } catch (ArithmeticException e) {
            System.out.println("Divisão por zero não é permitida.");
        } catch (NumberFormatException e) {
            System.out.println("Apenas números válidos.");
        } catch (Exception e) {
            System.out.println("Erro inesperado: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
