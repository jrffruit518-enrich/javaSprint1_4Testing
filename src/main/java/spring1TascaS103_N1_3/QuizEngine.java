package spring1TascaS103_N1_3;

import java.util.List;
import java.util.Map;
import java.util.Random;

public class QuizEngine {
    public int playGame(List<Map.Entry<String, String>> countries, QuizConsoleIO io, int rounds) {
        Random random = new Random();
        int score = 0;
        for (int i = 1; i <= rounds; i++) {
            int index = random.nextInt(countries.size());

            String country = countries.get(index).getKey();
            String capital = countries.get(index).getValue();

            io.displayQuestion(i, country);

            String answer = io.readAnswer();

            if (answer.equalsIgnoreCase(capital)) {
                io.displayCorrect();
                score++;
            } else {
                io.displayWrong(capital);
            }
        }
        return score;
    }

}
