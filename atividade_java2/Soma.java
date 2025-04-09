public class Soma {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        int soma = 0;

        for (int num : numeros) {
            soma += num;
        }

        System.out.println("A soma dos elementos do array é: " + soma);
    }
}

