package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GroupingDifferenceTest extends NumberDifferenceTest {

    @Test // TC8
    public void testDifferenceResultInGroup2() {
        // (1) setup (arrange, build)
        int diff = 25;
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

}
