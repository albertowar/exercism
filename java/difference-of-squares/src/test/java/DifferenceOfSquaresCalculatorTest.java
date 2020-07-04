import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.math.BigInteger;

public class DifferenceOfSquaresCalculatorTest {
    @Test
    public void testDifferenceOfSquaresUpToOne() {
        BigInteger expected = BigInteger.valueOf(0);
        BigInteger actual = DifferenceOfSquaresCalculator.computeDifferenceOfSquares(BigInteger.valueOf(1));
        assertEquals(expected, actual);
    }

    @Test
    public void testDifferenceOfSquaresUpToFive() {
        BigInteger expected = BigInteger.valueOf(170);
        BigInteger actual = DifferenceOfSquaresCalculator.computeDifferenceOfSquares(BigInteger.valueOf(5));
        assertEquals(expected, actual);
    }

    @Test
    public void testDifferenceOfSquaresUpToHundred() {
        BigInteger expected = BigInteger.valueOf(25164150);
        BigInteger actual = DifferenceOfSquaresCalculator.computeDifferenceOfSquares(BigInteger.valueOf(100));
        assertEquals(expected, actual);
    }

    @Test
    public void testDifferenceOfSquaresUpToBigNumbers() {
        BigInteger expected = new BigInteger("1809251394333065552839431876657969314038251722614177856670374901545953132544");
        BigInteger actual = DifferenceOfSquaresCalculator.computeDifferenceOfSquares(BigInteger.valueOf(Long.MAX_VALUE));
        assertEquals(expected, actual);
    }
}
