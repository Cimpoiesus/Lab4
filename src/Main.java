public class Main {
    public static void main(String[] args) {
        FractionArray fractionArray = new FractionArray(2);
        fractionArray.addMixedFraction(0, new MixedFraction(1, 1, 2));
        fractionArray.addMixedFraction(1, new MixedFraction(3, 2, 2));

        fractionArray.printFractions();

        fractionArray.printMixedFractionDivision(0, 1);
        fractionArray.printMixedFractionDivision(1, 1);
    }
}