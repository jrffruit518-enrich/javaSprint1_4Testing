package spring1TascaS103_N1_3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourntyQuiz {

    public void countryQuizMain() {

        try {
            HashMap<String, String> countryMap = CountryLoader.countryLoad();
            List<Map.Entry<String, String>> entries = new ArrayList<>(countryMap.entrySet());
            System.out.println("Please enter your name.");
            String name = EntryQuiz.readString();
            System.out.println("Begin the game." + '\n');
            int score = 0;
            int count = 1;
            do {
                int i = (int) (Math.random() * (entries.size()));
                String country = entries.get(i).getKey();
                String capital = entries.get(i).getValue();
                System.out.println(country + '\n');
                System.out.println("Please enter your answer");
                String answer = EntryQuiz.readString();
                System.out.println();
                if (answer.equalsIgnoreCase(capital)) {
                    score++;
                }
                entries.remove(i);
                count++;
            } while (count <= 10);
            System.out.println("Game is over. You can check the score in quiz result. Thank you for using.");
            File dir = new File("output");
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file = new File(dir, "quiz result.txt");
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file, true))) {
                bw.write("Name : " + name + '\n');
                bw.write("Score = " + score + '\n');
                bw.write("---------------------\n");
            }

        } catch (IOException e) {
            System.out.println("There is something wrong with the file.");
            e.printStackTrace();
        }

    }

}
