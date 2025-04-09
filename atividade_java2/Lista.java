import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lista {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        nomes.add("Ana Clara");
        nomes.add("Bruno");
        nomes.add("Amanda");
        nomes.add("Gustavo");
        nomes.add("Aurora");

        Iterator<String> iterator = nomes.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().startsWith("A")) {
                iterator.remove();
            }
        }

        System.out.println("Nomes removidos com letra 'A': " + nomes);
    }
}