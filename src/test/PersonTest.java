package test;
import app.Person;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.jupiter.api.*;

import org.junit.jupiter.api.Test;

class PersonTest {
	
	public static Person p;
	
	@BeforeEach
	public void setUp() throws IOException{
		p = new Person();
	}

	@Test
	void testIsMaior() {
		p.setIdade(40);
		assertTrue(p.isMaior(p.getIdade()));
	}
	
	@Test
	void testIsEqual() {
		p.setIdade(40);
		assertEquals(40, p.getIdade());
	}
}
