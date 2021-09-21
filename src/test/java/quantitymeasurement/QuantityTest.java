package quantitymeasurement;

import org.junit.Assert;
import org.junit.Test;

public class QuantityTest {

    @Test
    public void givenZeroFeetAndZeroFeet_ThenShouldBeEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(0.0);
        Assert.assertEquals(feet1, feet2);
    }

    @Test
    public void givenZeroFeetAndOneFeet_ThenShouldBeNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenOneFeetAndOneFeet_ThenShouldBeEqual() {
        Feet feet1 = new Feet(1.0);
        Feet feet2 = new Feet(1.0);
        Assert.assertTrue(feet1.compare(feet2));
    }

    @Test
    public void givenZeroFeetAndNull_ThenShouldBeNotEqual() {
        Feet feet1 = new Feet(0.0);
        Feet feet2 = null;
        Assert.assertNotEquals(feet1, feet2);
    }

    @Test
    public void givenFeetFromSameRef_ThenShouldBeEqual() {
        Feet feet1 = new Feet(0.0);
        Assert.assertTrue(feet1.equals(feet1));
    }

    @Test
    public void givenFeetAndString_ThenShouldNotBeEqual() {
        Feet feet1 = new Feet(1);
        String feet = "String Feet";
        Assert.assertNotEquals(feet1, feet);

    }

    @Test
    public void givenZeroInchAndZeroInch_ThenShouldBeEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(0.0);
        Assert.assertEquals(inch1, inch2);
    }

    @Test
    public void givenZeroInchAndOneInch_ThenShouldBeNotEqual() {
        Inch inch1 = new Inch(0.0);
        Inch inch2 = new Inch(1.0);
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenZeroInchAndNull_ThenShouldBeEqual() {
        Inch inch1 = new Inch(0.0);
        Feet inch2 = null;
        Assert.assertNotEquals(inch1, inch2);
    }

    @Test
    public void givenInchFromSameRef_ThenShouldBeEqual() {
        Inch inch1 = new Inch(0.0);
        boolean SameRef = inch1 == inch1;
        Assert.assertTrue("Equals", SameRef);
    }

    @Test
    public void givenZeroInchAndString_ThenShouldBeNotEqual() {
        Inch inch1 = new Inch(0.0);
        String inchString = "String Object";
        Assert.assertNotEquals(inch1, inchString);
    }
}
