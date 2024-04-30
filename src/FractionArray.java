class FractionArray {
    private Fraction[] fractions;

    public FractionArray(int size) {
        fractions = new Fraction[size];
    }

    public void addFraction(int index, Fraction fraction) {
        fractions[index] = fraction;
    }

    public void addMixedFraction(int index, MixedFraction mixedFraction) {
        fractions[index] = mixedFraction;
    }

    public void printFractions() {
        for (Fraction fraction : fractions) {
            if (fraction != null) {
                fraction.print();
            }
        }
    }

    public void printDivision(int index1, int index2) {
        if (fractions[index1] != null && fractions[index2] != null) {
            double result = fractions[index1].divide(fractions[index2]);
            System.out.println("Rezultatul împărțirii: " + result);
        }
    }

    public void printMixedFractionDivision(int index1, int index2) {
        if (fractions[index1] instanceof MixedFraction && fractions[index2] instanceof MixedFraction) {
            MixedFraction mixedFraction1 = (MixedFraction) fractions[index1];
            MixedFraction mixedFraction2 = (MixedFraction) fractions[index2];
            double result = mixedFraction1.divide(fractions[index2]);
            System.out.println("Rezultatul împărțirii: " + result);
        }
    }

}