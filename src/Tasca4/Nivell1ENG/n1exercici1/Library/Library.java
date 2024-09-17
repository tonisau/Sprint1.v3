package Tasca4.Nivell1ENG.n1exercici1.Library;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private List<String> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // Add a book to the list (at the end)
    public void addBook(String title) {
        if (!books.contains(title)) {
            books.add(title);
            Collections.sort(books); // Sort the list alphabetically after adding
        }
    }

    // Get the complete list of books
    public List<String> getBooks() {
        return new ArrayList<>(books); // Return a copy of the list
    }

    // Get a book by its position
    public String getBook(int position) {
        if (position >= 0 && position < books.size()) {
            return books.get(position);
        }
        throw new IndexOutOfBoundsException("Position out of bounds.");
    }

    // Add a book at a specific position
    public void addBookAtPosition(String title, int position) {
        if (!books.contains(title)) {
            books.add(position, title);
            Collections.sort(books); // Sort the list alphabetically after adding
        }
    }

    // Remove a book by its title
    public void removeBook(String title) {
        books.remove(title);
    }

    // Get the size of the list
    public int getSize() {
        return books.size();
    }
}
