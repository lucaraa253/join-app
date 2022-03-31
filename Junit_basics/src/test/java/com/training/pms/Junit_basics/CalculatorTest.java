package com.training.pms.Junit_basics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class CalculatorTest {

	Calculator calc;
	int expected = 20;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("SETUP BEFORE CLASS CALLED");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("TEAR DOWN AFTER CLASS CALLED");
	}

	@BeforeEach
	void setUp() throws Exception {
		expected = 20;
		System.out.println("SETUP CALLED");
		calc = new Calculator();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("TEAR DOWN CALLED");
		calc = null;
	}

	@Test
	void testAdd() {
		System.out.println("Test add called");
		int actual = calc.add(10, 10);
		assertEquals(expected, actual);
	}

	@Test
	void testMul() {
		int actual = calc.mul(10, 2);
		assertEquals(expected, actual);
	}

	@Test
	void testSub() {
		int actual = calc.sub(40, 20);
		assertEquals(expected, actual);
	}

	@Test
	void testDiv() {
		int actual = calc.div(100, 5);
		assertEquals(expected, actual);
	}

	@Test
	void testIsEven() {
		assertTrue(calc.isEven(expected));
	}

}
