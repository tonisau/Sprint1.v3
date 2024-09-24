package Tasca4.Nivell2ENG.n2exercici7;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OptionalExampleTest {

    @Test
    public void testOptionalIsEmpty() {
        OptionalExample example = new OptionalExample();
        Optional<String> optional = example.getEmptyOptional();

        // Verifica que l'Optional està buit
        assertTrue(optional.isEmpty(), "The Optional should be empty.");
    }
}
