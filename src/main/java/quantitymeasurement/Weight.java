package quantitymeasurement;

public class Weight {

    enum Unit {KILOGRAM, GRAM, TONNE}

    private static final double KILOGRAM_TO_GRAM = 1000;
    private static final double TONNE_TO_KILOGRAM = 1000;
    ;

    private final Unit unit;
    private final double value;

    public Weight(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Weight that) {
        if (this.unit.equals(Unit.KILOGRAM) && that.unit.equals(Unit.GRAM))
            return Double.compare(this.value * KILOGRAM_TO_GRAM, that.value) == 0;

        if (this.unit.equals(Unit.GRAM) && that.unit.equals(Unit.KILOGRAM))
            return Double.compare(this.value, that.value * KILOGRAM_TO_GRAM) == 0;

        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.KILOGRAM))
            return Double.compare(this.value * TONNE_TO_KILOGRAM, that.value) == 0;

        if (this.unit.equals(Unit.KILOGRAM) && that.unit.equals(Unit.TONNE))
            return Double.compare(this.value, that.value * TONNE_TO_KILOGRAM) == 0;

        return false;
    }

    public Weight finalWeightOfSum(Weight that) {
        double Finalsum = 0.0;
        if (this.unit.equals(Unit.TONNE) && that.unit.equals(Unit.GRAM))
            Finalsum = this.value * TONNE_TO_KILOGRAM + that.value / KILOGRAM_TO_GRAM;
        return new Weight(Unit.KILOGRAM, Finalsum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Weight weight = (Weight) o;
        return Double.compare(weight.value, value) == 0 && unit == weight.unit;
    }
}
