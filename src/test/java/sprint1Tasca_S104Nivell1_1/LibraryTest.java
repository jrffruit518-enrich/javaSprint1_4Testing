package sprint1Tasca_S104Nivell1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Test
    public void testBookListIsNotNullAfterCreation() {
        if (library.getBookManagement().getBooks() == null) {
            throw new RuntimeException("The books is null. Failed.");
        } else {
            System.out.println(("The books is not null. Test is successful."));
        }

    }

    @Test
    public void testAddMultipleBooksSize() {
        try {
            library.getBookManagement().addBook("book1");
            library.getBookManagement().addBook("book2");
            if (library.getBookManagement().getBooks().size() == 2) {
                System.out.println("The test is successful.");
            } else {
                System.out.println("The test is failed.");
            }
        } catch (ExceptionBookExisted e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testListIsAlphabeticallyOrdered() {
        try {
            library.getBookManagement().addBook("Z");
            library.getBookManagement().addBook("L");
            library.getBookManagement().addBook("A");
            ArrayList<String> listTitle = new ArrayList<>();
            Iterator<Book> iterator = library.getBookManagement().getBooks().iterator();
            while (iterator.hasNext()) {
                listTitle.add(iterator.next().getName());
            }
            ArrayList<String> listSort = new ArrayList<>(listTitle);
            Collections.sort(listSort);
            assertEquals(listSort, listTitle,"The test is failed.");
            System.out.println("The test is successful.");
        } catch (ExceptionBookExisted e) {
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void testNoDuplicateBookTitles() {
        try {
            library.getBookManagement().addBook("Hamlet");
            library.getBookManagement().addBook("Zoo");
            library.getBookManagement().addBook("1984");
            HashSet<String> bookTitle = new HashSet<>();
            Iterator<Book> iterator = library.getBookManagement().getBooks().iterator();
            while (iterator.hasNext()) {
                bookTitle.add(iterator.next().getName());
            }
            assertEquals(library.getBookManagement().getBooks().size(), bookTitle.size(),"The test is failed.");
            System.out.println("The test is successful.");
        } catch (ExceptionBookExisted e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testGetBookByPosition() {
        try {
            library.getBookManagement().addBook("A Tale of Two Cities");
            library.getBookManagement().addBook("Brave New World");
            library.getBookManagement().addBook("Cien años de soledad");

            List<Book> books = library.getBookManagement().getBooks();

            assertEquals("The test is failed.", "A Tale of Two Cities", books.get(0).getName());
            assertEquals("The test is failed.", "Brave New World", books.get(1).getName());
            assertEquals("The test is failed.", "Cien años de soledad", books.get(2).getName());
            System.out.println("The test is successful.");
        } catch (ExceptionBookExisted e) {
            System.out.println(e.getMessage());
        }

    }

    @Test
    public void testAddBookIncreasesSize() {

        try {
            library.getBookManagement().addBook("A Tale of Two Cities");
            library.getBookManagement().addBook("Brave New World");
            library.getBookManagement().addBook("Cien años de soledad");
            ArrayList<Book> booksInicial = new ArrayList<>(library.getBookManagement().getBooks());

            assertEquals( 3, booksInicial.size(),"The test is failed.");
            System.out.println("The test is successful.");
        } catch (ExceptionBookExisted e) {
            throw new RuntimeException(e);
        }

    }

    @Test
    public void testBookRemovalReducesListSize() {

        try {
            library.getBookManagement().addBook("A Tale of Two Cities");
            library.getBookManagement().addBook("Brave New World");
            library.getBookManagement().addBook("Cien años de soledad");
            library.getBookManagement().removeBook("A Tale of Two Cities");
            List<Book> books = new ArrayList<>(library.getBookManagement().getBooks());

            assertEquals( 2, books.size(),"The test is failed.");
            System.out.println("The test is successful.");
        } catch (ExceptionBookExisted e) {
            throw new RuntimeException(e);
        } catch (ExceptionBookEmpty e) {
            throw new RuntimeException(e);
        }


    }

    @Test
    public void testBooksRemainSortedAfterAddOrRemove() {

            try {
                library.getBookManagement().addBook("Brave New World");
                library.getBookManagement().addBook("Cien años de soledad");
                library.getBookManagement().addBook("A Tale of Two Cities");

                List<Book> books = library.getBookManagement().getBooks();

                for (int i = 0; i < books.size() - 1; i++) {
                    String current = books.get(i).getName();
                    String next = books.get(i + 1).getName();
                    assertTrue(current.compareTo(next) <= 0,"List should be sorted alphabetically");
                }

                library.getBookManagement().addBook("Dune");
                books = library.getBookManagement().getBooks();

                for (int i = 0; i < books.size() - 1; i++) {
                    String current = books.get(i).getName();
                    String next = books.get(i + 1).getName();
                    assertTrue(current.compareTo(next) <= 0,"List should remain sorted after adding a book");
                }

                library.getBookManagement().removeBook("Cien años de soledad");
                books = library.getBookManagement().getBooks();

                for (int i = 0; i < books.size() - 1; i++) {
                    String current = books.get(i).getName();
                    String next = books.get(i + 1).getName();
                    assertTrue(current.compareTo(next) <= 0,"List should remain sorted after removing a book");
                }

                System.out.println("The test is successful.");
            } catch (ExceptionBookExisted e) {
                System.out.println(e.getMessage());
            } catch (ExceptionBookEmpty e) {
                System.out.println(e.getMessage());
            }

        }


}
