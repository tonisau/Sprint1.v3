package Tasca4.Nivell1ENG.n1exercici3.test;

import static org.junit.jupiter.api.Assertions.*;

import Tasca4.Nivell1ENG.n1exercici3.OutOfBounds;
import org.junit.jupiter.api.Test;

class OutOfBoundsTest {

	@Test
	void exceptionTesting() {
		assertThrows(ArrayIndexOutOfBoundsException.class, () -> OutOfBounds.getColor(4));
	}

}
