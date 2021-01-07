package ru.vsu.cs.ostroverkhov.tests;


import org.junit.Assert;
import org.junit.Test;
import ru.vsu.cs.ostroverkhov.logic.FindingNotNullElementsBetweenNullElements;

public class FindingNotNullElementsBetweenNullElementsTests {

    @Test
    public void findNotNullElementsBetweenZeroElements1() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, 2, 3, 4, 0});
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements2() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{1, 2, 3, 4, 5, 6});
        int expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements3() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{1, 2, 3, 4, 0, 0});
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements4() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{1, 2, 3, 4, 5, 0});
        int expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements5() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, 2, 3, 4, 5, 0});
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements6() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{-200, 250, 113, 124, 25});
        int expectedResult = -1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements7() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, -2, -3, -4, -5, 0});
        int expectedResult = 4;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements8() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{1, 0, 3, 0, 5, 6});
        int expectedResult = 1;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements9() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 0});
        int expectedResult = 7;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements10() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, 0, 3, 4, 5, 6});
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements11() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, 2, 0, 4, 5, 0});
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void findNotNullElementsBetweenZeroElements12() {
        int actualResult = FindingNotNullElementsBetweenNullElements.findNotNullElementsBetweenNullElements(new int[]{0, 0, 0, 0, 0, 0});
        int expectedResult = 0;
        Assert.assertEquals(expectedResult, actualResult);
    }
}