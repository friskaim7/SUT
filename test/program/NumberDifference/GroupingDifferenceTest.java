package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class GroupingDifferenceTest extends NumberDifferenceTest{

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
