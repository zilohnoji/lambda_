import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Program {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Path file = Paths.get("teste.txt");

        try (BufferedReader br = new BufferedReader(new FileReader(file.toFile()))) {

            List<String> linhas = br.lines().toList(); // 0 - 5

            IntStream.range(0, linhas.size())
                    .filter(i -> i % 3 == 0) // Gera um stream contendo os multiplos de 3 (0 e 3)
                    .forEach(i -> System.out.printf("[%d] Nome: %s | Senha: %s | Classe: %s\n", i,
                            linhas.get(i).split(" ")[1],
                            linhas.get(i+1).split(" ")[1],
                            linhas.get(i+2).split(" ")[1]));

        } catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }
    }
}
