package sprint1Tasca_S104Nivell1_1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;


public class LibraryTest {
    private Library library ;

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
        assertEquals(0, library.getBooks().size(), "Initial list size should be 0.");
        library.addBook(new Book("A Tale of Two Cities"));
        assertEquals(1, library.getBooks().size(), "The list size should be 1.");
        library.addBook(new Book("Cien años de soledad"));
        assertEquals(2, library.getBooks().size(), "The list size should be 2.");
        library.addBook(new Book("Hamlet"));
        assertEquals(3, library.getBooks().size(), "The list size should be 3.");

    }

    @Test
    void testBookAtCorrectPositionWithAddBook() {

        library.addBook(new Book("Brave New World"));
        library.addBook(new Book("Animal Farm"));
        assertEquals("Animal Farm", library.showName(0), "Animal Farm should be at index 0 (sorted).");
        assertEquals("Brave New World", library.showName(1), "Brave New World should be at index 1 (sorted).");


        library.addBook(new Book("1984")); // 1984
        assertEquals("1984", library.showName(0), "1984 should be at index 0 (sorted).");
        assertEquals("Animal Farm", library.showName(1), "Animal Farm should be at index 1 (sorted).");
        assertEquals("Brave New World", library.showName(2), "Brave New World should be at index 2 (sorted).");
    }

    @Test
    void testBookAtCorrectPositionWithAddBookIndex() {
        library.addBookIndex(new Book("Brave New World"), 0); // Brave New World
        library.addBookIndex(new Book("Animal Farm"), 0); // Animal Farm
        assertEquals("Animal Farm", library.showName(0), "Animal Farm should be at index 0 (sorted).");
        assertEquals("Brave New World", library.showName(1), "Brave New World should be at index 1 (sorted).");


        library.addBookIndex(new Book("1984"), 1); // 1984
        assertEquals("1984", library.showName(0), "1984 should be at index 0 (sorted).");
        assertEquals("Animal Farm", library.showName(1), "Animal Farm should be at index 1 (sorted).");
        assertEquals("Brave New World", library.showName(2), "Brave New World should be at index 2 (sorted).");
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
            bookTitle.add(iterator.next().getName().toLowerCase());
        }
        assertEquals(library.getBooks().size(), bookTitle.size());

    }

    @Test
    public void testGetNameByPosition() {
        library.addBookIndex(new Book("Cien años de soledad"),0);
        library.addBook(new Book("A Tale of Two Cities"));
        library.addBookIndex(new Book("Brave New World"),0);

        assertEquals("A Tale of Two Cities", library.getBooks().get(0).getName());
        assertEquals("Brave New World", library.getBooks().get(1).getName());
        assertEquals("Cien años de soledad", library.getBooks().get(2).getName());


    }

    @Test
    public void testAddBookIncreasesSize() {

        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBookIndex(new Book("Hamlet"),1);
        library.addBook(new Book("zoo"));
        library.addBookIndex(new Book("1984"),0);

        assertEquals(5, library.getBooks().size());

    }

    @Test
    public void testBookRemovalReducesListSize() {


        library.addBook(new Book("A Tale of Two Cities"));
        library.addBook(new Book("Cien años de soledad"));
        library.addBook(new Book("Hamlet"));
        library.addBook(new Book("zoo"));
        library.addBook(new Book("1984"));
        library.removeBook("A Tale of Two Cities");
        assertEquals(4, library.getBooks().size());



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
