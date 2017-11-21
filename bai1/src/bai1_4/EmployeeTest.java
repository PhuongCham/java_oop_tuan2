package bai1_4;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {
	Employee e = new Employee(1,"trieu","cham",12);
	@Test
	public void testEmployee1() {
		assertEquals(1,e.getId());
		assertEquals("trieu",e.getFirstName());
		assertEquals("cham",e.getLastName());
		assertEquals(12,e.getSalary());
	}
	@Test
	public void testgetID() {
		assertEquals(1,e.getId());
	}
	@Test
	public void testgetfirstName() {
		assertEquals("trieu",e.getFirstName());
	}
	@Test
	public void testgetlastName() {
		assertEquals("cham",e.getLastName());
	}
	@Test
	public void testgetName() {
		assertEquals("trieucham",e.getName());
	}
	@Test
	public void testgetSalary() {
		assertEquals(12,e.getSalary());
	}
	@Test
	public void testsetSalary() {
		e.setSalary(13);
		assertEquals(13,e.getSalary());
	}
	@Test
	public void testgetAnnualSalary() {
		assertEquals(144,e.getAnnualSalary());
	}
	@Test
	public void testraiseSalary() {
		assertEquals(24,e.raiseSalary());
	}
	@Test
	public void testtoString() {
		assertEquals("Employee[id=1,name=trieucham,salary=12]",e.toString());
	}
	

}
