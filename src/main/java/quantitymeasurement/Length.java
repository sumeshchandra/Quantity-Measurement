package quantitymeasurement;

public class Length {

    enum Unit {FEET, INCH}

    ;

    private final Unit unit;
    private final double value;

    public Length(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Length feet2) {
        return true;
    }

    public double convertFeetToInch() {
        return value * 12;
    }

    public double convertFeetTOYard() {
        return value / 3;
    }

    public double convertInchTOYard() {
        return value / 36;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Length length = (Length) o;
        return Double.compare(length.value, value) == 0 && unit == length.unit;
    }

}
