package bai2_8;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AccountTest {
	
	Customer customer = new Customer(1, "cham", 'f');
	
	@Test
	public void testAccount() {
		Account account = new Account();
		account.setID(1);
		account.setCustomer(customer);
		account.setBalance(10000.0);
		
		assertEquals(1, account.getID());
		assertEquals("cham(1)", account.getCustomer().toString());
		assertEquals(10000.0, account.getBalance(), 0.0001);
	}
	
	@Test
	public void testAccount2() {
		Account account = new Account(2, customer);
		
		assertEquals(2, account.getID());
		assertEquals("cham(1)", account.getCustomer().toString());
	}
	
	@Test
	public void testDefaultConstructorWithThreeArguments() {
		Account account = new Account(3, customer, 1010.0);
		
		assertEquals(3, account.getID());
		assertEquals("cham(1)", account.getCustomer().toString());
		assertEquals(1010.0, account.getBalance(), 0.00001);
	}
	
	@Test
	public void testSetID() {
		Account account = new Account();
		account.setID(4);
		
		assertEquals(4, account.getID());
	}
	
	@Test
	public void testGetID() {
		Account account = new Account(5, customer, 20000);
		
		assertEquals(20000, account.getID());
	}
	
	@Test
	public void testSetCustomer() {
		Account account = new Account();
		account.setCustomer(customer);
		
		assertEquals("cham(1)", account.getCustomer().toString());
	}
	
	@Test
	public void testGetCustomer() {
		Account account = new Account(6, customer, 60000);
		
		assertEquals("cham(1)", account.getCustomer().toString());
	}
	
	@Test
	public void testSetBalance() {
		Account account = new Account();
		account.setBalance(10000);
		
		assertEquals(10000, account.getBalance(), 0.0001);
	}
	
	@Test
	public void testGetBalance() {
		Account account = new Account(7, customer, 70000);
		
		assertEquals(70000, account.getBalance(), 0.0001);
	}
	
	@Test
	public void testGetCustomerName() {
		Account account = new Account();
		account.setCustomer(customer);
		
		assertEquals("cham", account.getCustomerName());
	}
	
	@Test
	public void testDeposit() {
		Account account = new Account(8, customer, 800000);
		
		assertEquals(700000, account.deposit(1000000).getBalance(), 0.0001);
	}
	
	@Test
	public void testWithDraw() {
		Account account = new Account();
		account.setBalance(400000);
		
		// amount > balance
		assertEquals(400000, account.withdraw(500000).getBalance(), 2);
		
		// amount == balance
		account.setBalance(400000);
		assertEquals(0, account.withdraw(400000).getBalance(), 2);
		
		// amount < balance
		account.setBalance(400000);
		assertEquals(100000, account.withdraw(300000).getBalance(), 2);
	}
	
	@Test
	public void testToString() {
		Account account = new Account(45, customer, 10.0);
		
		assertEquals("cham(1) balance=$10.0", account.toString());
	}
	
}