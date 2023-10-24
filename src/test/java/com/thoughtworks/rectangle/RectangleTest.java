package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOf0WhenLengthOrBreadthIs0() {
        Integer ACTUAL = 0;
        Rectangle rectangle = new Rectangle(0,5);
        Integer EXPECTED = rectangle.area();
        assertThat(ACTUAL, is(equalTo(EXPECTED)));
    }

    @Test
    public void shouldReturnAreaOf10WhenLengthIs2AndBreadthIs5() {

        Integer ACTUAL = 10;
        Rectangle rectangle = new Rectangle(2,5);
        Integer EXPECTED = rectangle.area();
        assertThat(ACTUAL, is(equalTo(EXPECTED)));
    }
}