package com.example.restservice;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;

public class EmployeesTest {
	@Test
	public void testGetEmployeeListWhenListIsNull() {
		// Arrange
		// Mocking the behavior of the Employees class to return null for employeeList
		Employees mockEmployees = mock(Employees.class);
		when(mockEmployees.getEmployeeList()).thenReturn(null);

		// Act
		List<Employee> result = mockEmployees.getEmployeeList();

		// Assert
		assertEquals(null, result);
	}

	@Test
	public void testGetEmployeeListWhenListIsNotNull() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "John", "Swift","john@gmail.com","teacher"));
		employeeList.add(new Employee(2, "Alice", "Wang","alice@gmail.com","Technician"));
		employeeList.add(new Employee(3, "Harry", "Bo","harry@gmail.com","gardener"));

		Employees testEmployees = new Employees();
		testEmployees.setEmployeeList(employeeList);

		List<Employee> result = testEmployees.getEmployeeList();
		assertEquals(employeeList, result);
	}

	@Test
	public void testSetEmployeeList() {
		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(new Employee(1, "John", "Swift","john@gmail.com","teacher"));
		employeeList.add(new Employee(2, "Alice", "Wang","alice@gmail.com","Technician"));
		employeeList.add(new Employee(3, "Harry", "Bo","harry@gmail.com","gardener"));

		Employees testEmployees = new Employees();
		testEmployees.setEmployeeList(employeeList);

		assertEquals(employeeList, testEmployees.getEmployeeList());
	}
}
