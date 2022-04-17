package program.NumberDifference;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class ValidateRangeInputMaxDeretTest extends NumberDifferenceTest{
    @Test //TC15
	public void testInputNBilBawahRange() {
		// (1) setup (arrange, build)
		int jumlahDeretBil;
		boolean actual, expected;
		jumlahDeretBil = 0; // berada di bawah range
		expected = false;

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
		expected = false;

		// (2) exercise (act, operate)
		actual = sut.validateRangeInputMaxDeret(jumlahDeretBil);

		// (3) verify (assert, check)
		assertEquals(expected, actual);
	}
}
