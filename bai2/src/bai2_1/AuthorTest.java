package bai2_1;

import static org.junit.Assert.*;

import org.junit.Test;

public class AuthorTest {
	
	Author a = new Author("cham","linh@gmail.com",'f');
	@Test
	public void testAuthor() {
		assertEquals("cham",a.getName());
		assertEquals("linh@gmail.com",a.getEmail());
		assertEquals('f',a.getGender());
	}
	@Test
	public void testsetGender() {
		a.setGender('m');
		assertEquals('m',a.getGender());
	}
	@Test
	public void testsetEmail() {
		a.setEmail("hoang@gmail.com");
		assertEquals("hoang@gmail.com",a.getEmail());
	}
	@Test 
	public void testtoString() {
		assertEquals("Author[name=cham,email=linh@gmail.com,gender=f]",a.toString());
	}

}
