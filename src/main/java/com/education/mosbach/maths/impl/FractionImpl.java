package com.education.mosbach.maths.impl;

import com.education.mosbach.maths.api.DenominatorNotZeroException;
import com.education.mosbach.maths.api.Fraction;

public class FractionImpl implements com.education.mosbach.maths.api.Fraction {

    int nominator = 1;
    int denominator = 1;

    public FractionImpl(int nominator, int denominator) {
        this.nominator = nominator;
        this.denominator = denominator;
    }

    @Override
    public int getNominator() {
        return nominator;
    }

    public void setNominator(int nominator) {
        this.nominator = nominator;
    }

    @Override
    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        if (denominator == 0) throw new DenominatorNotZeroException();
        this.denominator = denominator;
    }

    int euklid(int a, int b) {
        if (a == b) return a;
        if (b > a) return euklid(b, a);
        return euklid(a-b, b);
    }

    @Override
    public void simplify() {
        int greatestCommonDivisor = euklid(getNominator(), getDenominator());
        setDenominator(denominator / greatestCommonDivisor);
        setNominator(nominator / greatestCommonDivisor);
    }

    public static void main(String[] args) {
        Fraction fraction = new FractionImpl(17, 24);
        try {
            fraction.setDenominator(0);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
