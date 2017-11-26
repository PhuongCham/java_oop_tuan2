package bai2_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CustomerTest {
	
	@Test
	public void testCustomer() {
		Customer customer = new Customer();
		customer.setID(1);
		customer.setName("Ctm 1");
		customer.setGender('m');
		
		assertEquals(1, customer.getID());
		assertEquals("Ctm 1", customer.getName());
		assertEquals('m', customer.getGender());
	}
	
	@Test
	public void testCustomer2() {
		Customer customer = new Customer(2, "Ctm 2", 'f');
		
		assertEquals(2, customer.getID());
		assertEquals("Ctm 2", customer.getName());
		assertEquals('f', customer.getGender());
	}
	
	@Test
	public void testSetID() {
		Customer customer = new Customer();
		customer.setID(10);
		
		assertEquals(10, customer.getID());
	}
	
	@Test
	public void testGetID() {
		Customer customer = new Customer(2, "Ctm 3", 'f');
		
		assertEquals(2, customer.getID());
	}
	
	@Test
	public void testSetName() {
		Customer customer = new Customer();
		customer.setName("Ctm 4");
		
		assertEquals("Ctm 4", customer.getName());
	}
	
	@Test
	public void testGetName() {
		Customer customer = new Customer(5, "Ctm 5", 'f');
		customer.setName("cham");
		
		assertEquals("cham", customer.getName());
	}
	
	@Test
	public void testSetGender() {
		Customer customer = new Customer();
		customer.setGender('m');
		
		assertEquals('m', customer.getGender());
	}
	
	@Test
	public void testGetGender() {
		Customer customer = new Customer(6, "Ctm 6", 'm');
		
		assertEquals('m', customer.getGender());
	}
	
	@Test
	public void testToString() {
		Customer customer = new Customer(7, "cham", 'f');
		
		assertEquals("cham(7)", customer.toString());
	}
	
}