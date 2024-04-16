package main.java;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestFinalAssignment2 {

	@Test
	void testNotNumeric() {
		String str1 = "test";
		InputCheck inputCheck = new InputCheck(str1);
		assertFalse(inputCheck.isNumeric());
		
		String str2 = "";
		inputCheck = new InputCheck(str2);
		assertFalse(inputCheck.isNumeric());
		
		String str3 = "        ";
		inputCheck = new InputCheck(str3);
		assertFalse(inputCheck.isNumeric());
		
		String str4 = "-4";
		inputCheck = new InputCheck(str4);
		assertFalse(inputCheck.isNumeric());
	}
	
	@Test
	void testIsNumeric() {
		String str1 = "10";
		InputCheck inputCheck = new InputCheck(str1);
		assertTrue(inputCheck.isNumeric());
		
		String str2 = "01234567890";
		inputCheck = new InputCheck(str2);
		assertTrue(inputCheck.isNumeric());
	}
	
	@Test
	void testInvalidSize() {
		String str1 = "10000000000";
		InputCheck inputCheck = new InputCheck(str1);
		assertFalse(inputCheck.checkSize());
		
		String str2 = "104857601";
		inputCheck = new InputCheck(str2);
		assertFalse(inputCheck.checkSize());
	}
	
	@Test
	void testValidSize() {
		String str1 = "1";
		InputCheck inputCheck = new InputCheck(str1);
		assertTrue(inputCheck.checkSize());
		
		String str2 = "104857600";
		inputCheck = new InputCheck(str2);
		assertTrue(inputCheck.checkSize());
	}

}
