import java.math.BigInteger;

public class DifferenceOfSquaresCalculator {
    // (n(n+1)/2)^2
    private static BigInteger computeSquareOfSumTo(BigInteger n) {
        BigInteger nPlusOne = n.add(BigInteger.valueOf(1));
        BigInteger sum = n.multiply(nPlusOne).divide(BigInteger.valueOf(2));

        return sum.pow(2);
    }

    // n(n+1)(2n+1)/6
    private static BigInteger computeSumOfSquaresTo(BigInteger n) {
        BigInteger nPlusOne = n.add(BigInteger.valueOf(1));
        BigInteger twoNPlusOne = n.multiply(BigInteger.valueOf(2)).add(BigInteger.valueOf(1));
        return n.multiply(nPlusOne).multiply(twoNPlusOne).divide(BigInteger.valueOf(6));
    }

    public static BigInteger computeDifferenceOfSquares(BigInteger n) {
        return computeSquareOfSumTo(n).subtract(computeSumOfSquaresTo(n));
    }
}
