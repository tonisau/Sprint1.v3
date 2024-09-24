package Tasca4.Nivell2ENG.n2exercici2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

public class ObjectReferenceTest {

    @Test
    public void testSameReference() {
        Object obj1 = new Object();
        Object obj2 = obj1; // obj2 apunta al mateix objecte que obj1

        // Aserció que demostra que les referències apunten al mateix objecte
        assertSame(obj1, obj2, "Both references should point to the same object.");
    }

    @Test
    public void testDifferentReference() {
        Object obj1 = new Object();
        Object obj2 = new Object(); // obj2 apunta a un objecte diferent

        // Aserció que demostra que les referències apunten a objectes diferents
        assertNotSame(obj1, obj2, "The references should point to different objects.");
    }
}
