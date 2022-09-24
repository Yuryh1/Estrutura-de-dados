package ATIVIDADE;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

 
public class Q2 {
    public static void main(String[] args) throws FileNotFoundException {
        Queue<String> ingressos = new LinkedList<>();
        Random random = new Random();
        Scanner scanner;

        scanner = new Scanner(new File("./ingressos.txt"));
        while (scanner.hasNextLine())
            ingressos.add(scanner.nextLine());

        if (!ingressos.isEmpty()) {
            for (int i = 0; i < 10; i++)
                System.out.println(ingressos.poll() + " - VIP");

            List<String> ingressosRestantes = new ArrayList<>(ingressos);
            System.out.println(
                    ingressosRestantes.get(random.nextInt(ingressosRestantes.size() - 1))
                            + " - Pessoa sorteada para conhecer a banda"
            );
        } else
            System.out.println("Não foram vendidos ingressos.");
    }
}
