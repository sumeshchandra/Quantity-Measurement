package quantitymeasurement;

public class Feet {
    private final double value;

    public Feet(double value) {
        this.value = value;
    }

    public boolean compare(Feet feet2) {
        return true;
    }

    public double convertFeetToInch() {
        return value * 12;
    }

    public double convertFeetTOYard() {
        return value / 3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Feet feet = (Feet) o;
        return Double.compare(feet.value, value) == 0;
    }
}
