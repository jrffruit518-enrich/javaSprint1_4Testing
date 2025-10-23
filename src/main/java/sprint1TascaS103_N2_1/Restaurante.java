package sprint1TascaS103_N2_1;

import java.util.Objects;

public class Restaurante {
    private String name;
    private int score;

    public Restaurante(String name, int score) {
        this.name = name;
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Restaurante that = (Restaurante) o;
        return score == that.score && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Restaurante{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }
}
