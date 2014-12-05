

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import dev.HelloAnt;

public class TestHelloAnt {
	static HelloAnt ant;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		ant = new HelloAnt();
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		ant = null;
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		int i = 100;
		ant.setI();
		assertEquals(i, ant.getI());
	}

}
