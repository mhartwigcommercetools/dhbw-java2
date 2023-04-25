package com.education.mosbach.maths.impl;

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


}
