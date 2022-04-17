package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GroupingDifferenceTest extends NumberDifferenceTest{

    @Test
    public void testDifferenceResultInGroup1_02() {
        // (1) setup (arrange, build)
        int diff = 1;
        String actual, expected = "Difference : 1\nGroup 1, Small Difference";       

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

}
