package spring1Tasca_S104Nivell1_1;

import java.util.*;

class BookManagement {
    private List<Book> books;


    public BookManagement() {
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public int lookFor(Book book) {
        return books.indexOf(book);
    }

    public void addBook(String name) throws ExceptionBookExisted {
        Book book = new Book(name);
        if (this.lookFor(book) != -1) {
            throw new ExceptionBookExisted();
        } else {
            books.add(book);
            books.sort(Comparator.comparing(Book::getName));
        }
    }

    public void show() {
        Iterator<Book> iterator = books.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    public String showName(int i) throws ExceptionBookOutOfBound {
        this.indexValid(i);
        return books.get(i).getName();
    }


    public void addBookByInt(int i, String name) throws ExceptionBookOutOfBound, ExceptionBookExisted {
        this.indexValid(i);
        Book book = new Book(name);
        if (this.lookFor(book) != -1) {
            throw new ExceptionBookExisted("The book is existed.");
        } else {
            books.add(i, book);
        }
    }

    public void removeBook(String name) throws ExceptionBookEmpty {
        boolean found = false;
        for (int i = books.size() - 1; i >= 0; i--) {
            if (books.get(i).getName().equals(name)) {
                books.remove(i);
                books.sort(Comparator.comparing(Book::getName));
                found = true;
            }
        }
        if (!found) {
            throw new ExceptionBookEmpty("We don't have this book.");
        }

    }

    public int indexValid(int i) throws ExceptionBookOutOfBound {
        if (i < 0 || i >= books.size()) {
            throw new ExceptionBookOutOfBound("The number is out of bound. ");
        }
        return i;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BookManagement that = (BookManagement) o;
        return Objects.equals(books, that.books);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(books);
    }

    @Override
    public String toString() {
        return "BookManagement{" +
                "books=" + books +
                '}';
    }
}

