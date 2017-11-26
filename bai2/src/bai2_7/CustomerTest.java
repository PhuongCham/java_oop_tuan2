package bai2_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class CustomerTest {
	Customer c = new Customer(1,"cham",2);
	@Test
	public void testCustomer() {
		assertEquals("cham",c.getName());
		assertEquals(1,c.getID());
		assertEquals(2,c.getDiscount());
	}
	@Test
	public void testsetDiscount() {
		c.setDiscount(3);
		assertEquals(3,c.getDiscount());
	}
	@Test
	public void testtoString() {
		assertEquals("cham(1)",c.toString());
	}

}
