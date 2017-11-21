package bai1_7;

import static org.junit.Assert.*;

import org.junit.Test;

public class DateTest {
	Date d = new Date(15,01,1996);
	@Test
	public void testDate() {
		assertEquals(15,d.getDay());
		assertEquals(1,d.getMonth());
		assertEquals(1996,d.getYear());
	}
	public void testgetDay() {
		assertEquals(15,d.getDay());
	}
	public void testgetMonth() {
		assertEquals(1,d.getMonth());
	}
	public void testgetYear() {
		assertEquals(1996,d.getYear());
	}
	public void testsetDay() {
		d.setDay(10);
		assertEquals(10,d.getDay());
	}
	public void testsetMonth() {
		d.setMonth(2);
		assertEquals(2,d.getMonth());
	}
	public void testsetYear() {
		d.setYear(1998);
		assertEquals(1998,d.getYear());
	}
	public void testsetDate() {
		d.setDate(20,11,1999);
		assertEquals(20,d.getDay());
		assertEquals(11,d.getMonth());
		assertEquals(1999,d.getYear());
	}
	public void testtoString() {
		assertEquals("15/01/1996",d.toString());
	}
	

}
