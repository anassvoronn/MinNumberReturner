package org.dz.solution;

public class MinNumberReturner {
    public double getMinimalNumber(final int intNumber,
                                 final float floatNumber,
                                 final double doubleNumber) {
        if ((Math.abs(intNumber)) < (Math.abs(floatNumber)) && (Math.abs(intNumber)) < (Math.abs(doubleNumber))) {
            System.out.println (Math.abs(intNumber));
            return intNumber;
        } else if ((Math.abs(floatNumber)) < (Math.abs(intNumber)) && (Math.abs(floatNumber)) < (Math.abs(doubleNumber))) {
            System.out.println (Math.abs(floatNumber));
            return floatNumber;
        } else {
            System.out.println (Math.abs(doubleNumber));
            return doubleNumber;
        }

    }
}
