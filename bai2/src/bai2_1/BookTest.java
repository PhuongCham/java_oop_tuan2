package bai2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class BookTest {
	Author a = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm');
	Book b = new Book("ABC",a,10.0,10);
	Book b2 = new Book("aaa",a,20.0);
	@Test
	public void testBook() {
		assertEquals("Tan Ah Teck",a.getName());
		assertEquals("ahteck@nowhere.com",a.getEmail());
		assertEquals('m',a.getGender());
		assertEquals("ABC",b.getName());
		assertEquals(10,b.getQty());
		assertEquals(10.0,b.getPrice(),0.000001);
	}
	@Test
	public void testGetAuthor() {
		
		assertEquals("Tan Ah Teck", b.getAuthor().getName());
		assertEquals("ahteck@nowhere.com", b.getAuthor().getEmail());
		assertEquals('m', b.getAuthor().getGender());
	}
	@Test
	public void testBook2() {
		assertEquals("Tan Ah Teck",a.getName());
		assertEquals("ahteck@nowhere.com",a.getEmail());
		assertEquals('m',a.getGender());
		assertEquals("ABC",b.getName());
		assertEquals(10.0,b.getPrice(),0.000001);
	}
	@Test
	public void testsetPrice() {
		b.setPrice(20.0);
		assertEquals(20.0,b.getPrice(),0.000001);
	}
	@Test
	public void testQty() {
		b.setQty(20);
		assertEquals(20,b.getQty());
	}
	@Test
	public void testToString() {
		
		assertEquals("Book[name=ABC,Author[name=Tan Ah Teck,email=ahteck@nowhere.com,gender=m],price=10.0,qty=10]", b.toString());
	}
}
