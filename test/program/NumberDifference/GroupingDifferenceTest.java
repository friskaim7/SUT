package program.NumberDifference;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import java.util.ArrayList;

public class GroupingDifferenceTest extends NumberDifferenceTest {

    @Test // TC1
    public void testDifferenceResultInGroup1_01(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(10);
        deret.add(6);

        diffExpected=4;
        stringExpected="Difference : 4\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    @Test // TC2
    public void testDifferenceResultInGroup1_02(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(20);
        deret.add(10);

        diffExpected=10;
        stringExpected="Difference : 10\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }

    @Test // TC3
    public void testDifferenceResultInGroup1_03(){
        ArrayList<Integer> deret = new ArrayList<>();
        int n, diffActual, diffExpected;
        String stringActual, stringExpected;
        n=2;
        deret.add(10);
        deret.add(9);

        diffExpected=1;
        stringExpected="Difference : 1\nGroup 1, Small Difference";

        diffActual=sut.numberDiffirenceProcess(deret);
        stringActual=sut.groupingDifference(diffActual);

        assertEquals(diffExpected, diffActual);
        assertEquals(stringExpected, stringActual);
    }
    
    @Test // TC8
    public void testDifferenceResultInGroup2_01() {
        // (1) setup (arrange, build)
        int diff = 25; // range 11-50
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC9
    public void testDifferenceResultInGroup2_02() {
        // (1) setup (arrange, build)
        int diff = 50; // batas atas range group 2 (11-50)
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC10
    public void testDifferenceResultInGroup2_03() {
        // (1) setup (arrange, build)
        int diff = 11; // batas bawah range group 2 (11-50)
        String actual, expected = "Difference : " + diff + "\nGroup 2, Medium Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC11
    public void testDifferenceResultInGroup3_01() {
        // (1) setup (arrange, build)
        int diff = 65;// range group 3 (>50)
        String actual, expected = "Difference : " + diff + "\nGroup 3, Large Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

    @Test // TC12
    public void testDifferenceResultInGroup3_02() {
        // (1) setup (arrange, build)
        int diff = 51;// batas bawah range group 3 (>50)
        String actual, expected = "Difference : " + diff + "\nGroup 3, Large Difference";

        // (2) exercise (act, operate)
        actual = sut.groupingDifference(diff);

        // (3) verify (assert, check)
        assertEquals(expected, actual);
    }

}
