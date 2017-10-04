package jogo.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

public class TesteJogo{
	@Test
	public void test() {
	
		Jogo jogo = new Jogo();
		
		Assert.assertEquals("-1", jogo.fizzBuzz(-1));
		Assert.assertEquals("0", jogo.fizzBuzz(0));
		Assert.assertEquals("1", jogo.fizzBuzz(1));
		Assert.assertEquals("fizz", jogo.fizzBuzz(9));
		Assert.assertEquals("buzz", jogo.fizzBuzz(10));		
		Assert.assertEquals("fizz buzz", jogo.fizzBuzz(15));		
		
	}
}
