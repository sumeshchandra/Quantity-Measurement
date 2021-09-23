package quantitymeasurement;

import org.junit.Assert;
//import org.junit.Test;
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
    public void givenOneFeetAndOneFeet_ThenShouldBeEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length feet2 = new Length(Length.Unit.FEET, 1.0);
        Assert.assertTrue(feet1.compare(feet2));
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
    public void givenOneFeetEqualsTOTwelveInch_ThenShouldBeEqual() {
        Length feet = new Length(Length.Unit.FEET, 1);
        double result = feet.convertFeetToInch();
        Assertions.assertEquals(12, result);
    }

    @Test
    public void givenThreeFeetEqualsToOneYard_ThenShouldBeEqual() {
        Length feet = new Length(Length.Unit.FEET, 3);
        double result = feet.convertFeetTOYard();
        Assertions.assertEquals(1, result);
    }

    @Test
    public void givenOneFeetAndOneYard_ThenShouldBeNotEqual() {
        Length feet = new Length(Length.Unit.FEET, 1);
        double result = feet.convertFeetTOYard();
        Assertions.assertNotEquals(1, result);
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
        Length inch = new Length(Length.Unit.INCH, 0.0);
        double result = inch.convertInchTOYard();
        Assertions.assertNotEquals(0.277, result);
    }

    @Test
    public void givenOneFeetAndOneInch_ThenShouldBeNotEqual() {
        Length feet1 = new Length(Length.Unit.FEET, 1.0);
        Length inch1 = new Length(Length.Unit.INCH, 1.0);
        Assertions.assertNotEquals(feet1, inch1);
    }

//    @Test
//    public void givenThirtySixInchAndOneYard_ThenShouldBeEqual() {
//        Length inch = new Length(Length.Unit.INCH, 0.0);
//        double result = inch.convertInchTOYard();
//        Assertions.assertEquals(1, result);
//    }


    @Test
    public void givenZeroYardAndZeroYard_ThenShouldBeEqual() {      // Yard
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(0.0);
        Assertions.assertEquals(yard1, yard2);
    }

    @Test
    public void givenZeroYardAndOneYard_ThenShouldNotBeEqual() {
        Yard yard1 = new Yard(0.0);
        Yard yard2 = new Yard(1.0);
        Assertions.assertNotEquals(yard1, yard2);
    }

    @Test
    public void givenZeroYardAndNull_ThenShouldBeNotEqual() {
        Yard yard1 = new Yard(0);
        Yard yard2 = null;
        Assertions.assertNotEquals(yard1, null);
    }

    @Test
    public void givenThreeFeetEqualsOneYard_ThenShouldBeEqual() {
        Yard yard = new Yard(1.0);
        double result = yard.conversionYardtoFeet();
        Assertions.assertEquals(3, result);
    }

    @Test
    public void givenTwoFeetEqualsTwoYard_ThenShouldBeNotEqual() {
        Yard yard = new Yard(1);
        double result = yard.conversionYardtoFeet();
        Assertions.assertNotEquals(false, result);
    }

    @Test
    public void givenOneYardAndThirtySixInch_ThenShouldBeEqual() {
        Yard yard = new Yard(1);
        double result = yard.convertYardTOInch();
        Assertions.assertEquals(36, result);
    }

}






