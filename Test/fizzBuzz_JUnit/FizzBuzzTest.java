package fizzBuzz_JUnit;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	int test = 1;
	
	@Test
	public void testNumCheck３の倍数のときにfizzを返す() {
		int tree = test * 3;
		String actual = FizzBuzz.numCheck(tree);
		String expected = "fizz";
		assertThat(actual,is(expected));
	}
	@Test
	public void testNumCheck５の倍数のときにbuzzを返す(){
		int five = test * 5;
		String actual = FizzBuzz.numCheck(five);
		String expected = "buzz";
		assertThat(actual,is(expected));
	}
	@Test
	public void testNumCheck５と３の倍数のときにfizzbuzzを返す(){
		int fteen = test * (3 * 5);
		String actual = FizzBuzz.numCheck(fteen);
		String expected = "fizzbuzz";
		assertThat(actual,is(expected));
	}
	@Test
	public void testNumCheck５と３の倍数ではないときはnullを返す(){
		assertNull(FizzBuzz.numCheck(8));
	}
	
}
