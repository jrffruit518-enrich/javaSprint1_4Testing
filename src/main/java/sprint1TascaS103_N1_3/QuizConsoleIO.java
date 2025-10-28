package sprint1TascaS103_N1_3;

public class QuizConsoleIO {

    public String readName() {
    System.out.print("Please enter your name: ");
    return EntryQuiz.readString();
}

    public String readAnswer() {
        return EntryQuiz.readString();
    }

    public void displayQuestion(int round, String country) {
        System.out.printf("Round %d: What is the capital of %s? ", round, country);
    }

    public void displayCorrect() {
        System.out.println("Correct!");
    }

    public void displayWrong(String capital) {
        System.out.println("Wrong! The correct answer is: " + capital);
    }

    public void displayScore(String name, int score, int totalRounds) {
        System.out.printf("Game over! %s, your final score is: %d/%d%n", name, score, totalRounds);
    }

    public void displayError(String message) {
        System.out.println(message);
    }

}
