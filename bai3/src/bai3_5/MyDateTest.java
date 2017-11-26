package bai3_5;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MyDateTest {
	
	MyDate myDate = new MyDate(2017, 10, 20);
	@Test
	public void TestGetDayOfWeek() {
		
	
		assertEquals(3, myDate.getDayOfWeek(2017, 10, 20));
	}
	
	@Test
	public void TestNextDay() {
		MyDate myDate = new MyDate(2017, 2, 28);
		myDate = myDate.nextDay();
		assertEquals(1, myDate.getDay());
		assertEquals(3, myDate.getMonth());
	}
	@Test 
	public void TestisLeapYear() {
		assertEquals(true, myDate.isLeapYear(2017));
	}
	@Test 
	public void TestisValidDate() {
		assertEquals(true, myDate.isValidDate(2017,11,12));
	}
	@Test 
	public void TestMyDate() {
		myDate.setDate(2017, 10, 10);
		assertEquals(2017, myDate.getYear());
		assertEquals(10, myDate.getMonth());
		assertEquals(10, myDate.getDay());
	}
	@Test 
	public void TestsetYear() {
		myDate.setYear(2017);
		assertEquals(2017, myDate.getYear());
	}
	@Test 
	public void TestsetMonth() {
		myDate.setMonth(1);
		assertEquals(1, myDate.getMonth());	
	}
	@Test 
	public void TestsetDay() {
		myDate.setDay(1);
		assertEquals(1, myDate.getDay());	
		}
	@Test 
	public void TesttoString() {
		myDate.setDay(1);
		assertEquals(1, myDate.getDay());	
		}
	
	
	
	
}