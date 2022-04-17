package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LoopTest extends NumberDifferenceTest {

    @Test //TC6
    public void testLoop9x() {
        // (1) setup (arrange, build)
        ArrayList<Integer> deretBil = new ArrayList<>(
                Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 1, 2));
        int actual, expected = 1;

        // (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(deretBil);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

}
