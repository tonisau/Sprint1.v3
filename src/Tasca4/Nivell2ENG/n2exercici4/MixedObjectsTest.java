package Tasca4.Nivell2ENG.n2exercici4;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class MixedObjectsTest {

    private List<Object> mixedList;

    @BeforeEach
    public void setUp() {
        mixedList = new ArrayList<>();

        // Creem els objectes
        Car car = new Car("Tesla");
        Book book = new Book("The Catcher in the Rye");
        Person person = new Person("Alice");

        // Afegim els objectes a la llista
        mixedList.add(car);
        mixedList.add(book);
        mixedList.add(person);
    }

    // Verificar que l'ordre dels objectes és el mateix segons s'han inserit
    @Test
    public void testObjectsInsertedInOrder() {
        assertEquals(new Car("Tesla"), mixedList.get(0), "First element should be a Car with model Tesla.");
        assertEquals(new Book("The Catcher in the Rye"), mixedList.get(1), "Second element should be a Book with title The Catcher in the Rye.");
        assertEquals(new Person("Alice"), mixedList.get(2), "Third element should be a Person named Alice.");
    }

    // Verificar que la llista conté els objectes en qualsevol ordre
    @Test
    public void testListContainsObjectsInAnyOrder() {
        Car car = new Car("Tesla");
        Book book = new Book("The Catcher in the Rye");
        Person person = new Person("Alice");

        assertTrue(mixedList.contains(car), "The list should contain a Car with model Tesla.");
        assertTrue(mixedList.contains(book), "The list should contain a Book with title The Catcher in the Rye.");
        assertTrue(mixedList.contains(person), "The list should contain a Person named Alice.");
    }

    // Verificar que un dels objectes només ha estat afegit una vegada
    @Test
    public void testObjectAddedOnce() {
        long count = mixedList.stream().filter(o -> o.equals(new Person("Alice"))).count();
        assertEquals(1, count, "The Person named Alice should be added only once.");
    }

    // Verificar que un objecte no està present a la llista
    @Test
    public void testObjectNotInList() {
        Book missingBook = new Book("Moby Dick");

        assertFalse(mixedList.contains(missingBook), "The list should not contain a Book with title Moby Dick.");
    }
}
