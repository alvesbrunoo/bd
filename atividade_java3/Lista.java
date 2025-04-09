import java.util.ArrayList;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Daniela");

        System.out.println("Nomes em letras maiúsculas:");
        for (String nome : nomes) {
            System.out.println(nome.toUpperCase());
        }
    }
}

