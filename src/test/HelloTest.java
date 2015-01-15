package test;

import static org.junit.Assert.*;
import org.junit.Test;
import tgm.Hello;

/**
 * @author FOCK
 *
 */
public class HelloTest {
	/**
	 * Der Test
	 */
	@Test
	public void testHello() {
		Hello h = new Hello();
		assertEquals("Hello World", h.toString());
	}
}
