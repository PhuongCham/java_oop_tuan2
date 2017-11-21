package bai1_5;

import static org.junit.Assert.*;

import org.junit.Test;

public class InvoiceItemTest {
	InvoiceItem i = new InvoiceItem("1a","2b",1,1.0);
	@Test
	public void testInvoiceItem() {
		assertEquals("1a",i.getId());
		assertEquals("2b",i.getDesc());
		assertEquals(1,i.getQty());
		assertEquals(1.0,i.getUnitPrice(),0.000001);
	}
	public void testgetID() {
		assertEquals("1a",i.getId());
	}
	public void testgetDesc() {
		assertEquals("2b",i.getDesc());
	}
	public void testgetQty() {
		assertEquals(1,i.getQty());
	}
	public void testsetQty() {
		i.setQty(2);
		assertEquals(2,i.getQty());
	}
	public void testgetUnitPrice() {
		assertEquals(1.0,i.getUnitPrice(),0.00001);
	}
	public void testsetUnitPrice() {
		i.setUnitPrice(2.0);
		assertEquals(2.0,i.getUnitPrice(),0.000001);
	}
	public void testgetTotal() {
		assertEquals(1.0,i.getTotal(),0.000001);
	}
	public void testtoString() {
		assertEquals("InvoiceItem[id=1a,desc=2b,qty=1,unitPrice=1.0]",i.toString());
	}

}
