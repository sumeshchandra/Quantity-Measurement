package quantitymeasurement;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class QuantityTest {

    @Test
    public void givenZeroFeetAndZeroFeet_ThenShouldBeEqual() {   //Feet
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndOneFeet_ThenShouldBeNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndNull_ThenShouldBeNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Length feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetFromSameRef_ThenShouldBeEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 0.0);
        Assert.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenFeetAndString_ThenShouldNotBeEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1);
        String feet = "String Feet";
        Assert.assertNotEquals(feet1, feet);
    }

    @Test
    public void givenOneFeetEqualsTOTwelveInch_WhenCompared_ThenShouldBeEqual() {
        Length feet = new Length(Length.Unit.FEET, 1);
        Length inch = new Length(Length.Unit.INCH, 12);
        boolean compareCheck = feet.compare(inch);
        Assertions.assertTrue(compareCheck, "true");
    }

    @Test
    public void givenThreeFeetAndOneYard_WhenCompared_ThenShouldBeEqual() {
        Length feet = new Length(Length.Unit.FEET, 3);
        Length yard = new Length(Length.Unit.YARD, 1);
        boolean compareCheck = feet.compare(yard);
        Assertions.assertTrue(compareCheck, "True");

    }

    @Test
    public void givenZeroInchAndZeroInch_ThenShouldBeEqual() {            //Inch
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenZeroInchAndOneInch_ThenShouldBeNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = new Length(Length.Unit.INCH, 1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenZeroInchAndNull_ThenShouldBeNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        Length inch2 = null;
        Assert.assertNotEquals(inch1, null);
    }

    @Test
    public void givenInchFromSameRef_ThenShouldBeEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        boolean SameRef = inch1 == inch1;
        Assert.assertTrue("Equals", SameRef);
    }

    @Test
    public void givenZeroInchAndString_ThenShouldBeNotEqual() {
        Length inch1 = new Length(Length.Unit.INCH, 0.0);
        String inchString = "String Object";
        Assert.assertNotEquals(inch1, inchString);
    }

    @Test
    public void givenOneInchAndOneYard_ThenShouldBeNotEqual() {
        Length inch = new Length(Length.Unit.INCH, 1.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = inch.compare(yard);
        Assertions.assertFalse(compareCheck, "False");
    }

    @Test
    public void givenOneFeetAndOneInch_WhenCompared_ThenShouldBeNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        boolean compareCheck = feet1.compare(inch1);
        Assertions.assertFalse(compareCheck, "False");
    }

    @Test
    public void givenOneFeetAndOneFeet_ThenShouldBeEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        boolean compareCheck = feet1.compare(feet2);
        Assertions.assertTrue(compareCheck, "True");
    }


    @Test
    public void givenThirtySixInchAndOneYard_ThenShouldBeEqual() {
        Length inch = new Length(Length.Unit.INCH, 36.0);
        Length yard = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck, "True");
    }


    @Test
    public void givenZeroYardAndZeroYard_WhenCompared_ThenShouldBeEqual() {      // Yard
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 0.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void givenZeroYardAndOneYard_ThenShouldNotBeEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard1.compare(yard2);
        Assertions.assertFalse(compareCheck, "False");
    }

    @Test
    public void givenZeroYardAndNull_ThenShouldBeNotEqual() {
        Length yard1 = new Length(Length.Unit.YARD, 0.0);
        Length yard2 = null;
        Assertions.assertNotEquals(yard1, yard2);

    }


    @Test
    public void givenThreeFeetEqualsOneYard_WhenCompared_ThenShouldBeEqual() {
        Length yard = new Length(Length.Unit.FEET, 3.0);
        Length inch = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck, "true");
    }

    @Test
    public void givenOneFeetAndOneYard_WhenCompared_ThenShouldBeNotEqual() {
        Length yard = new Length(Length.Unit.FEET, 1.0);
        Length inch = new Length(Length.Unit.YARD, 1.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertFalse(compareCheck, "False");
    }

    @Test
    public void givenOneYardAndThirtySixInch_WhenCompared_ThenShouldBeEqual() {
        Length yard = new Length(Length.Unit.YARD, 1.0);
        Length inch = new Length(Length.Unit.INCH, 36.0);
        boolean compareCheck = yard.compare(inch);
        Assertions.assertTrue(compareCheck, "true");
    }

    // Centimeter

    @Test
    public void given0CmAnd0Cm_WhenCompared_ThenShouldBeEqual() {
        Length cm1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length cm2 = new Length(Length.Unit.CENTIMETER, 0.0);
        boolean compareCheck = cm1.compare(cm2);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void given0CmAnd1Cm_WhenCompared_ThenShouldBeEqual() {
        Length cm1 = new Length(Length.Unit.CENTIMETER, 0.0);
        Length cm2 = new Length(Length.Unit.CENTIMETER, 1.0);
        boolean compareCheck = cm1.compare(cm2);
        Assertions.assertFalse(compareCheck);
    }

    @Test
    public void given2InchAnd5Cm_WhenCompared_SThenShouldBeEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck, "True");
    }


}






