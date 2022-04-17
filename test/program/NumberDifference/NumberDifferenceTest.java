package program.NumberDifference;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;

public class NumberDifferenceTest {
	protected CalcNUmberDifference sut;

	/**
	 * Setup = inisiasi sebelum test dijalankan, preparation object
	 * --> pay attention to keep components and test cases small,
	 * --> the trade-off seems acceptable.
	 * --> implicit setup can be used to deine the fixture common for all tests.
	 * --> Small in-line and delegate setup statements may supplement ..
	 * the speciic preconditions on per-test basis.
	 */
	@Before
	public void setUp() throws Exception {
		sut = new CalcNUmberDifference();
	}

	@Test
	public void testClassInitialization() {
		assertNotNull(sut);
	}
}
