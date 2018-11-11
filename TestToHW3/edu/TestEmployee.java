package edu;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestEmployee {
	Employee empl= new Employee("ola",50,20);
//
//	@BeforeAll
//	static void setUpBeforeClass() throws Exception {
//	}
//
//	@AfterAll
//	static void tearDownAfterClass() throws Exception {
//	}
//
//	@BeforeEach
//	void setUp() throws Exception {
//	}
//
//	@AfterEach
//	void tearDown() throws Exception {
//	}


	@Test
	void testEmployee() {

	}

	@Test
	void testEmployeeStringInt() {
	}

	@Test
	void testEmployeeStringIntInt() {
	}

	@Test
	void testSalary() {
		//arrange
		
		//act
		int actual = empl.salary();
		
		//assert
		assertEquals(1000,actual);
	}

	@Test
	void testBonus() {
		assertEquals(100, empl.bonus());
	}

	@Test
	void testChangeRate() {
	}

	@Test
	void testTotalSum() {
	}

	@Test
	void testToString() {
	}

}
