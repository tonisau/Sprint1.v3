package Tasca4.Nivell1ENG.n1exercici1.Library;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class LibraryTest {

    private Library library;

    @BeforeEach
    public void setUp() {
        library = new Library();
    }

    // Verify that the list is not null after creating a new Library object
    @Test
    public void testListIsNotNullAfterCreation() {
        assertNotNull(library.getBooks());
    }

    // Confirm the list has the expected size after adding several books
    @Test
    public void testListSizeAfterAddingBooks() {
        library.addBook("Don Quixote");
        library.addBook("The Divine Comedy");
        assertEquals(2, library.getSize());
    }

    // Ensure the list contains a specific book at the correct position
    @Test
    public void testSpecificBookAtCorrectPosition() {
        library.addBook("1984");
        library.addBook("Don Quixote");
        assertEquals("1984", library.getBook(0)); // The list should be alphabetically sorted
    }

    // Verify that no duplicate book titles are allowed in the list
    @Test
    public void testNoDuplicateBooks() {
        library.addBook("1984");
        library.addBook("1984");
        assertEquals(1, library.getSize()); // Only one instance of the book should exist
    }

    // Verify retrieving a book title by its position
    @Test
    public void testRetrieveBookByPosition() {
        library.addBook("Don Quixote");
        assertEquals("Don Quixote", library.getBook(0));
    }

    // Ensure that adding a book correctly modifies the list
    @Test
    public void testAddBookModifiesList() {
        library.addBook("1984");
        assertEquals(1, library.getSize());
        assertTrue(library.getBooks().contains("1984"));
    }

    // Confirm that removing a book decreases the size of the list
    @Test
    public void testRemoveBookDecreasesSize() {
        library.addBook("Don Quixote");
        library.removeBook("Don Quixote");
        assertEquals(0, library.getSize());
    }

    // Verify that the list remains alphabetically ordered after adding or removing books
    @Test
    public void testListIsOrderedAfterAddOrRemove() {
        library.addBook("One Hundred Years of Solitude");
        library.addBook("1984");
        library.addBook("Don Quixote");

        List<String> books = library.getBooks();
        assertEquals("1984", books.get(0));
        assertEquals("Don Quixote", books.get(1));
        assertEquals("One Hundred Years of Solitude", books.get(2));

        library.removeBook("1984");
        books = library.getBooks();
        assertEquals("Don Quixote", books.get(0));
        assertEquals("One Hundred Years of Solitude", books.get(1));
    }
}
