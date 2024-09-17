package Tasca4.Nivell1ENG.n1exercici1.Months.test;

import static org.junit.jupiter.api.Assertions.*;

import Tasca4.Nivell1ENG.n1exercici1.Months.Months;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


class MonthsTest {
	ArrayList<String> months;
	
	@BeforeEach
	void setUp() {
		months = new ArrayList<String>();
		Months.insertMonths(months);
	}

	@Test
	void testNumberPositions() {
		assertEquals(12, months.size());
	}
	
	@Test
	void testNotNull() {
		assertNotNull(months);
	}
	
	@Test
	void testAugustPosition() {
		assertTrue(months.get(7).equals("Agosto"));
	}

}
