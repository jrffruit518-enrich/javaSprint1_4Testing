package sprint1Tasca_S104Nivell1_1;

import java.util.Objects;

public class Book {
    private String name;

    public Book(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("The name can not be empty.");
        }
        this.name = name.trim();
    }


    public String getName() {
        return name;
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(name, book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}' + '\n';
    }

}
