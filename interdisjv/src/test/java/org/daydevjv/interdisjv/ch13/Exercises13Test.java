package org.daydevjv.interdisjv.ch13;

import org.junit.Test;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class Exercises13Test {

    @Test
    public void testGreatestCommonDivisor() {
        assertThat(Exercises13.greatestCommonDivisor(5, 7), is(1));
        assertThat(Exercises13.greatestCommonDivisor(14, 21), is(7));
        assertThat(Exercises13.greatestCommonDivisor(35, 14), is(7));
    }

    @Test
    public void testGreatestCommonDivisorRecursive() {
        assertThat(Exercises13.greatestCommonDivisorRecursive(5, 7), is(1));
        assertThat(Exercises13.greatestCommonDivisorRecursive(14, 21), is(7));
        assertThat(Exercises13.greatestCommonDivisorRecursive(35, 14), is(7));
    }
}
