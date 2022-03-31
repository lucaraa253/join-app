package com.training.pms.junit_testcase;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CompanyTest {
	
	Company comp = new Company();

	@Test
	void testGetQuote() {
		String expected = "#REVATURE BELIEVES IN TRANSPARENT COMMUNICATION AND WORKS TOWARDS ENRICHING CAREERS#";
		String actual = comp.getQuote();
		assertEquals(expected, actual);
	}

}
