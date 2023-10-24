package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOf0WhenLengthAndBreadthIs0() {
        Rectangle rectangle = new Rectangle(0,5);
        int result = rectangle.area();
        assertThat(0, equalTo(result));
    }

    @Test
    public void shouldReturnAreaOf10WhenLengthIs2AndBreadthIs5() {
        Rectangle rectangle = new Rectangle(2,5);
        int result = rectangle.area();
        assertThat(10, equalTo(result));
    }
}