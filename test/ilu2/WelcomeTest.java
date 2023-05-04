package ilu2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WelcomeTest {

	@Test
	void test1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
		assertEquals(Welcome.welcome("Bob"),"Hello, Bob");
		assertEquals(Welcome.welcome("Paul"),"Hello, Paul");
		assertEquals(Welcome.welcome("paul"),"Hello, Paul");
	}
	
	@Test
	void test2() {
		String verif="Hello, my friend";
		assertEquals(Welcome.welcome(" "),verif);
		assertEquals(Welcome.welcome(""),verif);
		assertEquals(Welcome.welcome(null),verif);
	}
}
