package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class NumberDifferenceTest {
	private CalcNUmberDifference sut;

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
	public void testInputNBilLuarRange_01() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 15; // bukan berada pada range 1-10
		expected = false;

		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testInputNBilDalamRange_01() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 5; // berada pada range 1-10
		expected = true;

		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}

	@Test
	public void testDifferenceResultInGroup1_02() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		ArrayList<Integer> deretBil;
		boolean validateRangeActual, validateRangeExpected;
		// boolean numberDiffirenceActual, numberDiffirenceExpected;
		boolean groupingDifferenceActual, groupingDifferenceExpected;

		jumlahDeretBil = 10; // berada pada range 1-10
		deretBil = new ArrayList<Integer>(
				Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 2)); // 9x Loop

		validateRangeExpected = true;
		groupingDifferenceExpected = true;

		// (2) exercise (act, operate)
		validateRangeActual = sut.validateRangeInputMaxDeret(jumlahDeretBil);
		groupingDifferenceActual = sut.validateRangeInputMaxDeret(
				sut.numberDiffirenceProcess(deretBil));

		// (3) verify (assert, check)
		assertEquals(validateRangeExpected, validateRangeActual);
		assertEquals(groupingDifferenceExpected, groupingDifferenceActual);
	}

}
