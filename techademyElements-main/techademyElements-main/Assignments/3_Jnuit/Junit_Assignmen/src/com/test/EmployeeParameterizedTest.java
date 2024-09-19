package com.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class EmployeeParameterizedTest {

	@Before 
	public void beforeEachTest() {
		System.out.println("Test Started>>>>>>");
	}
	@After
	public void afterEachTest() {
		System.out.println("Test ended......");
	}
	
	
	@ParameterizedTest
	@ValueSource(doubles = {50000.0, 60000.0, 75000.0})
	
	public void testCalculateYearlyBonus(double salary) {
		Employee employee = new Employee(1, "John Doe", salary);
		double expectedBonus = salary * 0.1; // 10% of the salary as bonus
		assertEquals(expectedBonus, employee.calculateYearlyBonus(),0.0);
	}

}
