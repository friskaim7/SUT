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
	
	@Test //TC15
	public void testInputNBilBawahRange() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 0; // berada di bawah range
		expected = true;

		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test //TC16
	public void testInputNBilAtasRange() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 11; // berada di atas range
		expected = true;

		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
}
