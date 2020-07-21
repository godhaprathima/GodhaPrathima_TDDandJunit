package com.epam.vnrvjiet.prathima.TDDAndJunit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class DeleteAfromFirst2PositionsTest {

	EliminateAfromFirst2Positions eliminateAfromFirst2Positions;
	
	@BeforeEach
	void setup()
	{
		eliminateAfromFirst2Positions=new EliminateAfromFirst2Positions();
	}
	@Test
	void testFirst2As() {
		
		String actual=eliminateAfromFirst2Positions.removeA("AABC");
		assertEquals("BC",actual);
	}
	@Test
	void test1stPositionA() {
		
		String actual=eliminateAfromFirst2Positions.removeA("ABBC");
		assertEquals("BBC",actual);
	}
	@Test
	void test2ndPositionA() {
		
		String actual=eliminateAfromFirst2Positions.removeA("CABCC");
		assertEquals("CBCC",actual);
	}
	@Test
	void testNoA() {
		
		String actual=eliminateAfromFirst2Positions.removeA("CCABCC");
		assertEquals("CCABCC",actual);
	}
	@Test
	void testSingleCharString() {
		
		String actual=eliminateAfromFirst2Positions.removeA("A");
		assertEquals("",actual);
	}
	@Test
	void testSingleCharString1() {
		
		String actual=eliminateAfromFirst2Positions.removeA("B");
		assertEquals("B",actual);
	}
	@Test
	void testEmptyString() {
		
		String actual=eliminateAfromFirst2Positions.removeA("");
		assertEquals("",actual);
	}
	

}
