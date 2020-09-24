package untref.edu.dyasc.Fibo;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FiboTest 
{
	@Test
	public void test1() {
		
		
		Fibo f = new Fibo();
		String valorEsperado = "fibo<6>: 0 1 1 2 3 5";
		Assert.assertEquals(valorEsperado, f.fibonacci(6));
		
	}
	
	@Test
	public void test2() {
		
		
		Fibo f = new Fibo();
		String valorEsperado = "fibo<1>: 0";
		Assert.assertEquals(valorEsperado, f.fibonacci(1));
		
	}
	
	@Test
	public void test3() {
		
		
		Fibo f = new Fibo();
		String valorEsperado = "fibo<10>: 0 1 1 2 3 5 8 13 21 34";
		Assert.assertEquals(valorEsperado, f.fibonacci(10));
		
	}
	
	@Test
	public void test4() {
		
		
		Fibo f = new Fibo();
		Assert.assertEquals(null, f.fibonacci(0));
		
	}
}