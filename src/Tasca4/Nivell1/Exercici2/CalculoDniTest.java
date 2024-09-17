package Tasca4.Nivell1.Exercici2;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CalculoDniTest {

    // Test parametritzat amb 10 números de DNI i les seves lletres correctes
    @ParameterizedTest
    @CsvSource({
            "12345678, Z",
            "87654321, X",
            "11111111, H",
            "22222222, J",
            "33333333, R",
            "44444444, M",
            "55555555, G",
            "66666666, N",
            "77777777, P",
            "88888888, M"
    })
    public void testCalculoLletra(int numeroDni, char lletraEsperada) {
        Assertions.assertEquals(lletraEsperada, CalculoDni.calcularLletra(numeroDni));
    }
}
