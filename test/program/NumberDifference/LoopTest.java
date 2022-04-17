package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LoopTest extends NumberDifferenceTest {
    
    @Test //TC4
    public void testLoop2x() {
        // (1) setup (arrange, build)
        ArrayList<Integer> deretBil = new ArrayList<>(
                Arrays.asList(10, 5, 1));
        int actual, expected = 9;

        // (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(deretBil);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }
    
    @Test //TC5
    public void testLoop8x() {
        // (1) setup (arrange, build)
        ArrayList<Integer> deretBil = new ArrayList<>(
                Arrays.asList(1, 1, 1, 1, 1, 1, 1, 1, 2));
        int actual, expected = 1;

        // (2) exercise (act, operate)
        actual = sut.numberDiffirenceProcess(deretBil);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }
    
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
