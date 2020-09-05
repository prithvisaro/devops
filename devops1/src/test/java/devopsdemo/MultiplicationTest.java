package devopsdemo;

import static org.junit.Assert.*;

import org.junit.Test;

import devops1.Multiplication;

public class MultiplicationTest {

	@Test
	public void test() {
		
		Multiplication m = new Multiplication();
		int output = m.multiply();
		
		assertEquals(20000,output);
		
	}

}
