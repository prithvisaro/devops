package devopsdemo;

import static org.junit.Assert.*;

import org.junit.Test;

import devops1.Multiplication;

public class MultiplicationTest {

	@Test
	public void test() {
		
		Multiplication m = new Multiplication();
		int output = m.multiply(10,2000);
		
		assertEquals(20000,output);
		
	}

}
