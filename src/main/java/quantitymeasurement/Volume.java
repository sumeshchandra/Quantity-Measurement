package quantitymeasurement;

public class Volume {

    private static final double GALLON_TO_LITRE = 3.78;
    private static final double LITRE_TO_MILLILITRE = 1000;

    enum Unit {GALLON, LITRE, MILLI_LITRE}

    ;

    private final Unit unit;
    private final double value;

    public Volume(Unit unit, double value) {
        this.unit = unit;
        this.value = value;
    }

    public boolean compare(Volume that) {

        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.GALLON))
            return Double.compare(this.value, that.value) == 0;

        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITRE))
            return Double.compare(this.value * GALLON_TO_LITRE, that.value) == 0;

        if (this.unit.equals(Unit.MILLI_LITRE) && that.unit.equals(Unit.MILLI_LITRE))
            return Double.compare(this.value, that.value) == 0;

        if (this.unit.equals(Unit.LITRE) && that.unit.equals(Unit.MILLI_LITRE))
            return Double.compare(this.value * LITRE_TO_MILLILITRE, that.value) == 0;

        if (this.unit.equals(Unit.MILLI_LITRE) && that.unit.equals(Unit.LITRE))
            return Double.compare(this.value, that.value * LITRE_TO_MILLILITRE) == 0;

        return false;
    }

    public Volume volumeSum(Volume that) {
        double finalSum = 0.0;
        if (this.unit.equals(Unit.GALLON) && that.unit.equals(Unit.LITRE))
            finalSum = this.value * GALLON_TO_LITRE + that.value;

        if (this.unit.equals(Unit.LITRE) && that.unit.equals(Unit.MILLI_LITRE))
            finalSum = this.value + that.value / LITRE_TO_MILLILITRE;

        return new Volume(Unit.LITRE, finalSum);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Volume volume = (Volume) o;
        return Double.compare(volume.value, value) == 0 && unit == volume.unit;
    }
}
