package com.thoughtworks.rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOf0WhenLengthAndBreadthIs0() {
        Rectangle rectangle = new Rectangle(0,5);
        int result = rectangle.area();
        assertEquals(0, result);
    }

    @Test
    public void shouldReturnAreaOf10WhenLengthIs2AndBreadthIs5() {
        Rectangle rectangle = new Rectangle(2,5);
        int result = rectangle.area();
        assertEquals(10, result);
    }
}