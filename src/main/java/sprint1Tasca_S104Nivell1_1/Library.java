package sprint1Tasca_S104Nivell1_1;


import java.util.*;

public class Library {
    private List<Book> books;

  /*  该类必须允许将书籍添加到集合中。

    必须能够获取完整的书籍列表。

    必须能够根据位置获取某一本书的标题。

    必须能够在指定位置添加一本书。

    必须能够根据标题删除一本书*/

    /*该类必须允许将书籍添加到集合中。

必须能够获取完整的书籍列表。

必须能够根据位置获取某一本书的标题。

必须能够在指定位置添加一本书。

必须能够根据标题删除一本书。*/

    public Library(List<Book> books) {
        this.books = new ArrayList<>();
    }


    public void addBook(Book book) {
        if (book== null) {
            throw new IllegalArgumentException("The book can´t be null.");
        }
        this.books.add(book);
        this.books.sort(Comparator.comparing(Book::getName));
    }

    public List<Book> getBooks() {
        return Collections.unmodifiableList(books);
    }

    public String showName(int index) {
        if (index > books.size()) {
            throw new ExceptionBookOutOfBound("The index is out of bound.");
        }
        return this.books.get(index).getName();
    }

    public void addBookIndex(Book book,int index) {
        if (book== null) {
            throw new IllegalArgumentException("The book can´t be null.");
        }
        if (index > books.size()) {
            throw new ExceptionBookOutOfBound("The index is out of bound.");
        }
        this.books.add(index,book);
    }

    public void removeBook(String name) {
        if (name == null) {
            throw new IllegalArgumentException("The book can´t be null.");
        }
        int i;
        for (i = 0; i < books.size(); i++) {
            if (books.get(i).getName().equalsIgnoreCase(name) ) {
                books.remove(i);
                this.books.sort(Comparator.comparing(Book::getName));
            }
        }
        if (i == books.size()) {
            throw new ExceptionBookEmpty("There is no such a book.");
        }

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



