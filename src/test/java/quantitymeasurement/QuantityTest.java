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
    public void given2InchAnd5Cm_WhenCompared_ThenShouldBeEqual() {
        Length inch = new Length(Length.Unit.INCH, 2.0);
        Length cm = new Length(Length.Unit.CENTIMETER, 5.0);
        boolean compareCheck = inch.compare(cm);
        Assertions.assertTrue(compareCheck, "True");
    }
    // Volume

    @Test
    public void givenZeroGallonAndZeroGallon_ThenShouldBeEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 0.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void givenZeroGallonandOneGallon_ThenShouldNotBeEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = new Volume(Volume.Unit.GALLON, 1.0);
        boolean compareCheck = gallon1.compare(gallon2);
        Assertions.assertNotEquals(compareCheck, "False");
    }

    @Test
    public void givenZeroGallonAndNull_ThenShouldNotBeEqual() {
        Volume gallon1 = new Volume(Volume.Unit.GALLON, 0.0);
        Volume gallon2 = null;
        Assertions.assertNotEquals(gallon1, gallon2);
    }

    //LITRE

    @Test
    public void givenZeroLitreAndZeroLitre_ThenShouldBeEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE,0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE,0.0);
        Assertions.assertEquals(litre1, litre2);
    }

    @Test
    public void givenZeroLitreAndOneLitre_ThenShouldNotBeEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE,0.0);
        Volume litre2 = new Volume(Volume.Unit.LITRE,1.0);
        Assertions.assertNotEquals(litre1, litre2);
    }

    @Test
    public void givenZeroLitreAndNull_ThenShouldNotBeEqual() {
        Volume litre1 = new Volume(Volume.Unit.LITRE,0.0);
        Volume litre2 = null;
        Assertions.assertNotEquals(litre1, null);
    }

    @Test
    void givenZeroGallonAndZeroLitre_WhenCompared_ThenShouldBeEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume litre = new Volume(Volume.Unit.LITRE, 0.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    void givenZeroGallonAndOneLitre_WhenCompared_ThenShouldNotBeEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 0.0);
        Volume litre = new Volume(Volume.Unit.LITRE, 1.0);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertFalse(compareCheck, "False");
    }

    @Test
    void givenOneGallonAndValueLitre_WhenCompared_ThenShouldBeEqual() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre = new Volume(Volume.Unit.LITRE, 3.78);
        boolean compareCheck = gallon.compare(litre);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void given0LiterAnd0MilliLitre_WhenCompared_ThenShouldNotBeEqual() {
        Volume litre = new Volume(Volume.Unit.LITRE, 0.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITRE, 0.0);
        boolean compareCheck = litre.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1LiterAnd1000MilliLitre_WhenCompared_ThenShouldBeEqual() {
        Volume litre = new Volume(Volume.Unit.LITRE, 1.0);
        Volume ml = new Volume(Volume.Unit.MILLI_LITRE, 1000.0);
        boolean compareCheck = litre.compare(ml);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1000MilliLitreAnd1Litre_WhenCompared_ThenShouldBeEqual() {
        Volume millilitre1 = new Volume(Volume.Unit.MILLI_LITRE, 1000.0);
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        boolean compareCheck = millilitre1.compare(litre1);
        Assertions.assertTrue(compareCheck);
    }

    @Test
    public void given1GallonAnd3point78Litre_WhenAdded_ThenShouldReturnValue() {
        Volume gallon = new Volume(Volume.Unit.GALLON, 1.0);
        Volume litre = new Volume(Volume.Unit.LITRE, 3.78);
        Volume expected = new Volume(Volume.Unit.LITRE, 7.56);
        Volume actual = gallon.volumeSum(litre);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void given1LitreAnd1000ML_WhenAdded_ThenShouldReturnValue() {
        Volume litre1 = new Volume(Volume.Unit.LITRE, 1.0);
        Volume millilitre1 = new Volume(Volume.Unit.MILLI_LITRE, 1000.0);
        Volume expected = new Volume(Volume.Unit.LITRE, 2.0);
        Volume actual = litre1.volumeSum(millilitre1);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void givenZeroGramAndZeroGram_ThenShouldReturnEqual(){
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,0.0);
        Assertions.assertEquals(gram1, gram2);
    }

    @Test
    public void givenZeroGramAndOneGram_ThenShouldNotReturnEqual(){
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,1.0);
        Assertions.assertNotEquals(gram1, gram2);
    }

    @Test
    public void givenZeroGramAndNULL_ThenShouldNotReturnEqual(){
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = null;
        Assertions.assertNotEquals(gram1, null);
    }

    @Test
    public void givenTypeZeroGramAndZeroGram_ThenShouldReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,1.0);
        Assertions.assertEquals(gram1.getClass(), gram2.getClass());
    }

    @Test
    public void givenReferenceZeroGramAndZeroGram_ThenShouldNotReturnEqual() {
        Weight gram1 = new Weight(Weight.Unit.GRAM,0.0);
        Weight gram2 = new Weight(Weight.Unit.GRAM,1.0);
        boolean compareCheck = gram1.compare(gram2);
        Assertions.assertFalse(compareCheck, "False");
    }

    @Test
    public void given1KilogramAnd1000Gram_WhenCompared_ShouldReturnEqualWeight() {
        Weight kilogram = new Weight(Weight.Unit.KILOGRAM, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        boolean compareCheck = kilogram.compare(gram);
        Assertions.assertTrue(compareCheck,"True");
    }

    @Test
    public void given1000GramAnd1Kg_WhenCompared_ThenShouldReturnEqual(){
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight kilogram = new Weight(Weight.Unit.KILOGRAM, 1.0);
        boolean compareCheck = gram.compare(kilogram);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void given1TonneAnd1000Kgs_WhenCompared_ThenShouldReturnEqual() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight kilogram = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void given1000KgsAnd1Tonne_WhenCompared_ThenShouldReturnEqual() {
        Weight kilogram = new Weight(Weight.Unit.KILOGRAM, 1000.0);
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        boolean compareCheck = tonne.compare(kilogram);
        Assertions.assertTrue(compareCheck, "True");
    }

    @Test
    public void given1TonneAnd1000Gram_WhenAdded_ThenShouldReturnValue() {
        Weight tonne = new Weight(Weight.Unit.TONNE, 1.0);
        Weight gram = new Weight(Weight.Unit.GRAM, 1000.0);
        Weight expectedSum = new Weight(Weight.Unit.KILOGRAM, 1001.0);
        Weight actualSum = tonne.finalWeightOfSum(gram);
        Assertions.assertEquals(expectedSum, actualSum);
    }
}






