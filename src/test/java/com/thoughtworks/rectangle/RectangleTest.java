package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOf0WhenLengthOrBreadthIs0() {
        Rectangle rectangle = new Rectangle(0,5);
        double area = rectangle.area();
        assertThat(area, is(equalTo(0.0)));
    }

    @Test
    public void shouldReturnAreaOf10WhenLengthIs2AndBreadthIs5() {

        Rectangle rectangle = new Rectangle(2,5);
        double area = rectangle.area();
        assertThat(area, is(equalTo(10.0)));
    }
}