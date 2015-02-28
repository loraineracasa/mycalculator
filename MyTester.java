/**
*	Author: Marie Loraine C. Racasa
*		2012-17167	
*		AB-6L
*		Tester
**/

import static org.junit.Assert.*;

import org.junit.Test;


public class MyTester {

	@Test
	//Tests the function nfactorial -> getting the fatorial of a number
	
	public void testNfactorial() { 
		
		MyCalculator calculator = new MyCalculator();
		
		int actual = calculator.nfactorial(5);
		
		assertEquals("5! is 120",120,actual,0.0);
		
	}

	@Test
	//Tests the function binarySearch -> searching for a  number using binary search algorithm
		
	public void testBinarySearch() { 

		MyCalculator calculator2 = new MyCalculator();
		
		int [] array = {10, 18, 28, 38, 48};
		
		int actual = calculator2.binarySearch(array, 18);
		
		assertEquals("Find 18",1,actual,0.0);
	}

}
