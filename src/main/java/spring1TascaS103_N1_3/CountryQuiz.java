package spring1TascaS103_N1_3;

import java.io.IOException;
import java.util.*;

public class CountryQuiz {

    private static final int TOTAL_ROUNDS = 10;

    private final CountryRepository countryRepo;
    private final QuizEngine quizEngine;
    private final QuizConsoleIO consoleIO;
    private final ScoreRepository scoreRepo;

    public CountryQuiz() {
        this.countryRepo = new CountryRepository();
        this.quizEngine = new QuizEngine();
        this.consoleIO = new QuizConsoleIO();
        this.scoreRepo = new ScoreRepository();
    }

    public void startQuiz() {
        try {
            List<Map.Entry<String, String>> countries = countryRepo.loadCountries();
            String name = consoleIO.readName();
            int score = quizEngine.playGame(countries, consoleIO, TOTAL_ROUNDS);
            consoleIO.displayScore(name, score, TOTAL_ROUNDS);
            scoreRepo.saveScore(name, score);
        } catch (IOException e) {
            consoleIO.displayError("File operation error: " + e.getMessage());
        }
    }

}
