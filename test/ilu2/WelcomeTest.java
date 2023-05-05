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
	
	@Test
	void test3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
		assertEquals(Welcome.welcome("BOB"),"HELLO, BOB !");
		assertEquals(Welcome.welcome("PAUL"),"HELLO, PAUL !");
	}
	
	@Test
	void test4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob");
		assertEquals(Welcome.welcome("bob,amy"),"Hello, Bob and Amy");
		assertEquals(Welcome.welcome("paul,bob"),"Hello, Paul and Bob");
	}
	
	@Test
	void test5() {
		assertEquals(Welcome.welcome("amy,bob,jerry,michel"),"Hello, Amy, Bob, Jerry and Michel");
		assertEquals(Welcome.welcome("bob,amy,tristan"),"Hello, Bob, Amy and Tristan");
		assertEquals(Welcome.welcome("paul,bob,amy"),"Hello, Paul, Bob and Amy");
	}
	
	@Test
	void test6() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"),"Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("BOB,AMY,tristan"),"Hello, Tristan. AND HELLO, BOB AND AMY !");
	}
	@Test
	void test7() {
		assertEquals(Welcome.welcome("amy,BOB,jerry"),"Hello, Amy and Jerry. AND HELLO, BOB !");
		assertEquals(Welcome.welcome("BOB,AMY,tristan"),"Hello, Tristan. AND HELLO, BOB AND AMY !");
	}
}
