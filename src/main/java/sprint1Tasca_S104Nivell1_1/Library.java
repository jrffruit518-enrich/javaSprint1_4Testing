package sprint1Tasca_S104Nivell1_1;


import java.util.*;

public class Library {
    private List<Book> books;


    public Library() {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        if (book== null) {
            throw new IllegalArgumentException("The book can´t be null.");
        }
        if (books.contains(book)) {
            throw new IllegalArgumentException("The book is already existed.");
        }
        this.books.add(book);
        sortBooks();
    }

    public List<Book> getBooks() {
        return new ArrayList<>(books);
    }

    public String showName(int index) {
        if (index < 0 || index >= books.size()) {
            throw new IllegalArgumentException("The index is out of bound.");
        }
        return this.books.get(index).getName();
    }

    public void sortBooks() {
        this.books.sort(Comparator.comparing(Book::getName));
    }

    public void addBookIndex(Book book,int index) {
        if (book== null) {
            throw new IllegalArgumentException("The book can´t be null.");
        }
        if (books.contains(book)) {
            throw new IllegalArgumentException("The book is already existed.");
        }
        if (index < 0 || index > books.size()) {
            throw new IllegalArgumentException("The index is out of bound.");
        }
        this.books.add(index,book);
        sortBooks();
    }

    public void removeBook(String name) {
        if (name == null) {
            throw new IllegalArgumentException("The book can´t be null.");
        }
        boolean removed = this.books.removeIf(book -> book.getName().equalsIgnoreCase(name));
        if (!removed) {
            throw new IllegalArgumentException("There is no such a book.");
        }
        sortBooks();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Objects.equals(books, library.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }
}



