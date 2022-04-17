package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;

public class LoopTest extends NumberDifferenceTest {

    @Test //TC4
    public void testLoop2x(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=3;
        deret.add(10);
        deret.add(5);
        deret.add(1);

        diffExpected=9;
        stringExpected="Difference : 9\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    @Test //TC5
    public void testLoop8x(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=9;
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(1);
        deret.add(2);

        diffExpected=1;
        stringExpected="Difference : 1\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
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
