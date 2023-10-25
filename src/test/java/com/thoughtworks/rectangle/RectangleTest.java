package com.thoughtworks.rectangle;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.closeTo;

import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void shouldReturnAreaOf0WhenLengthOrBreadthIs0() {
        Rectangle rectangle = new Rectangle(0,5);
        double area = rectangle.area();
        assertThat(area, is(closeTo(0.0, 0.01)));
    }

    @Test
    public void shouldReturnAreaOf10WhenLengthIs2AndBreadthIs5() {

        Rectangle rectangle = new Rectangle(2,5);
        double area = rectangle.area();
        assertThat(area, is(closeTo(10.0, 0.01)));
    }

    @Test
    public void shouldReturnPerimeterOf14WhenLengthIs2AndBreadthIs5() {

        Rectangle rectangle = new Rectangle(2, 5);
        double perimeter = rectangle.perimeter();
        assertThat(perimeter, is(closeTo(14.0, 0.01)));
    }
}