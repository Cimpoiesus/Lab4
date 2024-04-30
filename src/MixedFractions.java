class MixedFraction implements Fraction {
    private int wholePart;
    private int numerator;
    private int denominator;

    public MixedFraction(int wholePart, int numerator, int denominator) {
        this.wholePart = wholePart;
        this.numerator = numerator;
        this.denominator = denominator;
    }
    @Override
    public double divide(Fraction other) {
        double thisValue = (double)(this.wholePart * this.denominator + this.numerator) / this.denominator;
        double otherValue = (double)((MixedFraction) other).numerator / ((MixedFraction) other).denominator;
        return thisValue / otherValue;
    }
    @Override
    public void print() {
        System.out.println(wholePart + " " + numerator + "/" + denominator);
    }
}
