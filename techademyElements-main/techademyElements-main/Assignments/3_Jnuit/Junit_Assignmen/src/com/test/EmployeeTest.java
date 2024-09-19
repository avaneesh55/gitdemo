package com.test;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class EmployeeTest {
	
	@Before 
	public void beforeEachTest() {
		System.out.println("Test Started>>>>>>");
	}
	@After
	public void afterEachTest() {
		System.out.println("Test ended......");
	}

	@Test
	public void testEmployeeAttributes() {
		Employee emp1 = new Employee(1, "John Doe", 50000.0);
		
		assertEquals(1,emp1.getId());
		assertEquals("John Doe",emp1.getName());
		assertEquals(50000.0,emp1.getSalary(),0.0);
	}
	@Test
	public void testRaiseSalary() {
		Employee emp = new Employee(1, "Jane Smith", 60000.0);
		
		emp.raiseSalary(10000.0);
		assertEquals(70000.0,emp.getSalary(),0.0);
	}
	@Test
	public void testEmployeeEquality() {
		Employee emp = new Employee(1, "Jane Smith", 60000.0);
		Employee emp1 = new Employee(1, "John Doe", 50000.0);
		
		assertEquals(false,emp.equals(emp1));
		
	}

}
