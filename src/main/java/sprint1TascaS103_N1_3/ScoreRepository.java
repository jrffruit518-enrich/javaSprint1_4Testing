package sprint1TascaS103_N1_3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class ScoreRepository {
    public void saveScore(String name, int score) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(
                new FileWriter("classificacio.txt", StandardCharsets.UTF_8, true))) {
            writer.write("Name: " + name + ", Score: " + score);
            writer.newLine();
        }
    }
}
