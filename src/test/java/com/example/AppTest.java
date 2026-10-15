
package com.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testMaximumPositiveNumbers() {
        App app = new App();
        int[] numbers = {10, 25, 7, 40, 15};
        assertEquals(40, app.findMax(numbers));
    }

    @Test
    public void testMaximumNegativeNumbers() {
        App app = new App();
        int[] numbers = {-10, -5, -20, -2};
        assertEquals(-2, app.findMax(numbers));
    }

    @Test
    public void testSingleElement() {
        App app = new App();
        int[] numbers = {8};
        assertEquals(8, app.findMax(numbers));
    }

    @Test
    public void testMaximumAtBeginning() {
        App app = new App();
        int[] numbers = {100, 20, 30, 40};
        assertEquals(100, app.findMax(numbers));
    }
}
