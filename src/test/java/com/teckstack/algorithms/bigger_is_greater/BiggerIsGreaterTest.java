package com.teckstack.algorithms.bigger_is_greater;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BiggerIsGreaterTest {

    private BiggerIsGreater biggerIsGreater;

    @BeforeEach
    public void setUp() {
        biggerIsGreater = new BiggerIsGreater();
    }


    @Test
    public void should_return_bigger() {
        assertThat(biggerIsGreater.resolve("bb"), is( "no answer"));
        assertThat(biggerIsGreater.resolve("ab"), is( "ba"));
        assertThat(biggerIsGreater.resolve("hefg"), is( "hegf"));
        assertThat(biggerIsGreater.resolve("dhck"), is( "dhkc"));
        assertThat(biggerIsGreater.resolve("dkhc"), is( "hcdk"));
    }
}
