package methods;

import org.junit.Assert;
import org.junit.Test;

public class ArrayTest {

    @Test
    public void arrayToStringNullTest(){

        String actual = Array.arrayToString(null);
        String expected = null;

    //    Assert.assertEquals(expected, actual);
        Assert.assertNull(actual);
    }

    @Test
    public void arrayToStringEmptyArrayTest(){

        String actual = Array.arrayToString(new int[]{});
        String expected = "{}";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void arrayToStringTest(){

        String actual = Array.arrayToString(new int[]{1, 2, 3, 4, 5});
        String expected = "{1, 2, 3, 4, 5}";

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findBiggerArrayHalfEmptyArrayTest() {
        int[] actual = Array.findBiggerArrayHalf(new int[] {});
        int[] expected = new int[0];

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findBiggerArrayHalfNullTest() {
        int[] actual = Array.findBiggerArrayHalf(null);

        Assert.assertNull(actual);
    }

    @Test
    public void findBiggerArrayHalfEvenArrayTest() {
        int[] actual = Array.findBiggerArrayHalf(new int[] {4, 19, 28, 25, 2, 9, 6, 17});
        int[] expected = new int[] {4, 19, 28, 25};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findBiggerArrayHalfOddArrayTest() {
        int[] actual = Array.findBiggerArrayHalf(new int[] {7, 2, 15, 99, 12, 14, 18});
        int[] expected = new int[] {12, 14, 18};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findBiggerArrayHalfOddEqualArrayTest() {
        int[] actual = Array.findBiggerArrayHalf(new int[] {7, 2, 15, 99, 3, 14, 7});
        int[] expected = new int[] {7, 2, 15, 99, 3, 14, 7};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findBiggerArrayHalfEvenEqualArrayTest() {
        int[] actual = Array.findBiggerArrayHalf(new int[] {7, 2, 15, 3, 14, 7});
        int[] expected = new int[] {7, 2, 15, 3, 14, 7};

        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void findCountNumberNullTest() {
        int actual = Array.findCountNumber(null, 0);

        Assert.assertEquals(-1, actual);
    }

    @Test
    public void findCountNumberEmptyTest() {
        int actual = Array.findCountNumber(new int[] {}, 0);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findCountNumberTest() {
        int actual = Array.findCountNumber(new int[] {4, 19, 25, 5, 7, 9, 5, 17},5);
        int expected = 2;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findCountNumber0Test() {
        int actual = Array.findCountNumber(new int[] {7, 2, 15},5);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }

}
