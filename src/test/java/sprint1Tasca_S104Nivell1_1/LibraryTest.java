package sprint1Tasca_S104Nivell1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {
    private Library library;

    @BeforeEach
    public void setup() {
        library = new Library();
    }

    @Test
    public void testBookListIsNotNullAfterCreation() {
        assertNotNull(library.getBooks(), "The book list should not be null after creating a new Library object.");

    }

    @Test
    public void testAddMultipleBooksSize() {

        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));

    }


    @Test
    public void testListIsAlphabeticallyOrdered() {
        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));
        ArrayList<String> listTitle = new ArrayList<>();
        Iterator<Book> iterator = library.getBooks().iterator();
        while (iterator.hasNext()) {
            listTitle.add(iterator.next().getName());
        }
        ArrayList<String> listSort = new ArrayList<>(listTitle);
        Collections.sort(listSort);
        assertEquals(listSort, listTitle, "The test is failed.");
    }

    @Test
    public void testNoDuplicateBookTitles() {
        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));
        HashSet<String> bookTitle = new HashSet<>();
        Iterator<Book> iterator = library.getBooks().iterator();
        while (iterator.hasNext()) {
            bookTitle.add(iterator.next().getName());
        }
        assertEquals(library.getBooks().size(), bookTitle.size(), "The test is failed.");

    }

    @Test
    public void testGetBookByPosition() {

        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));

        List<Book> books = library.getBooks();

        assertEquals("The test is failed.", "A Tale of Two Cities", books.get(0).getName());
        assertEquals("The test is failed.", "Brave New World", books.get(1).getName());
        assertEquals("The test is failed.", "Cien años de soledad", books.get(2).getName());
        System.out.println("The test is successful.");

    }

    @Test
    public void testAddBookIncreasesSize() {


        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));
        ArrayList<Book> booksInicial = new ArrayList<>(library.getBooks());

        assertEquals(3, booksInicial.size(), "The test is failed.");
        System.out.println("The test is successful.");

    }

    @Test
    public void testBookRemovalReducesListSize() {


        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));
        library.removeBook("A Tale of Two Cities");
        List<Book> books = new ArrayList<>(library.getBooks());

        assertEquals(2, books.size(), "The test is failed.");
        System.out.println("The test is successful.");


    }

    @Test
    public void testBooksRemainSortedAfterAddOrRemove() {

        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));
        library.removeBook("A Tale of Two Cities");

        List<Book> books = library.getBooks();

        for (int i = 0; i < books.size() - 1; i++) {
            String current = books.get(i).getName();
            String next = books.get(i + 1).getName();
            assertTrue(current.compareTo(next) <= 0, "List should be sorted alphabetically");
        }

        library.addBook(new Book("Dune"));
        books = library.getBooks();

        for (int i = 0; i < books.size() - 1; i++) {
            String current = books.get(i).getName();
            String next = books.get(i + 1).getName();
            assertTrue(current.compareTo(next) <= 0, "List should remain sorted after adding a book");
        }

        library.removeBook("Cien años de soledad");
        books = library.getBooks();

        for (int i = 0; i < books.size() - 1; i++) {
            String current = books.get(i).getName();
            String next = books.get(i + 1).getName();
            assertTrue(current.compareTo(next) <= 0, "List should remain sorted after removing a book");
        }


    }


}
