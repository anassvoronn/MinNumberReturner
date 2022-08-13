package org.dz.solution;

public class MinNumberReturner {
    public double getMinimalNumber(final int intNumber,
                                   final float floatNumber,
                                   final double doubleNumber) {
        final int intNumberAbs = Math.abs(intNumber);
        final float floatNumberAbs = Math.abs(floatNumber);
        final double doubleNumberAbs = Math.abs(doubleNumber);

        if (intNumberAbs < floatNumberAbs && intNumberAbs < doubleNumberAbs) {
            return intNumber;
        } else if (floatNumberAbs < intNumberAbs && floatNumberAbs < doubleNumberAbs) {
            return floatNumber;
        } else {
            return doubleNumber;
        }
    }
}