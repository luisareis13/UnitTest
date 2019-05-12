package fibo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class fiboTest {

	@Test
	void testFib() {
		long result = fibo.fib(3);
		assertTrue(result == 2);
	}

}
