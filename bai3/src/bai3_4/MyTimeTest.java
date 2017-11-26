package bai3_4;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MyTimeTest {

	MyTime mytime;
	@Before
	public void setUp() throws Exception {
		mytime=new MyTime(10, 11, 12);
	}

	@Test
	public void testMyTime() {
		assertEquals(10,mytime.getHour());
		assertEquals(11,mytime.getMinute());
		assertEquals(12,mytime.getSecond());
	}

	@Test
	public void testSetTime() {
		mytime.setTime(1, 2, 3);
		assertEquals(1,mytime.getHour());
		assertEquals(2,mytime.getMinute());
		assertEquals(3,mytime.getSecond());
	}

	@Test
	public void testGetHour() {
		assertEquals(10,mytime.getHour());
	}

	@Test
	public void testGetMinute() {
		assertEquals(11,mytime.getMinute());
	}

	@Test
	public void testGetSecond() {
		assertEquals(12,mytime.getSecond());
	}

	@Test
	public void testSetHour() {
		mytime.setHour(3);
		assertEquals(3,mytime.getHour());
		mytime.setHour(22);
		assertEquals(22,mytime.getHour());
	}

	@Test
	public void testSetMinute() {
		mytime.setMinute(11);
		assertEquals(11,mytime.getMinute());
	}

	@Test
	public void testSetSecond() {
		mytime.setSecond(11);
		assertEquals(11,mytime.getSecond());
	}

	@Test
	public void testToString() {
		assertEquals("10:11:12",mytime.toString());
	}

	@Test
	public void testNextSecond() {
		mytime.nextSecond();
		assertEquals("10:11:13",mytime.toString());
		
		mytime.setTime(23, 59, 59);
		mytime.nextSecond();
		assertEquals("00:00:00",mytime.toString());
	}

	@Test
	public void testNextMinute() {
		mytime.nextMinute();
		assertEquals("10:12:12",mytime.toString());
		
		mytime.setTime(23, 59, 59);
		mytime.nextMinute();
		assertEquals("00:00:59",mytime.toString());
	}

	@Test
	public void testNextHour() {
		mytime.nextHour();
		assertEquals("11:11:12",mytime.toString());
		
		mytime.setTime(23, 59, 59);
		mytime.nextHour();
		assertEquals("00:59:59",mytime.toString());
	}

	@Test
	public void testPreviousSecond() {
		mytime.previousSecond();
		assertEquals("10:11:11",mytime.toString());
		
		mytime.setTime(00, 00, 00);
		mytime.previousSecond();
		assertEquals("23:59:59",mytime.toString());
	}

	@Test
	public void testPreviousMinute() {
		mytime.previousMinute();
		assertEquals("10:10:12",mytime.toString());
		mytime.setTime(00, 00, 10);
		mytime.previousMinute();
		assertEquals("23:59:10",mytime.toString());
	}

	@Test
	public void testPreviousHour() {
		mytime.previousHour();
		assertEquals("09:11:12",mytime.toString());
		
		mytime.setTime(00, 10, 10);
		mytime.previousHour();
		assertEquals("23:10:10",mytime.toString());
	}

}