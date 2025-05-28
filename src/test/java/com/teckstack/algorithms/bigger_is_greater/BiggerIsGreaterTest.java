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
    public void should_return_next_greater_lexicographical_permutation_o_n2() {
        assertThat(biggerIsGreater.resolve_in_o_n2("bb"), is( "no answer"));
        assertThat(biggerIsGreater.resolve_in_o_n2("ab"), is( "ba"));
        assertThat(biggerIsGreater.resolve_in_o_n2("hefg"), is( "hegf"));
        assertThat(biggerIsGreater.resolve_in_o_n2("dhck"), is( "dhkc"));
        assertThat(biggerIsGreater.resolve_in_o_n2("dkhc"), is( "hcdk"));
    }

    @Test
    public void should_return_next_greater_lexicographical_permutation_o_n() {
        assertThat(biggerIsGreater.resolve_in_o_n("bb"), is( "no answer"));
        assertThat(biggerIsGreater.resolve_in_o_n("ab"), is( "ba"));
        assertThat(biggerIsGreater.resolve_in_o_n("hefg"), is( "hegf"));
        assertThat(biggerIsGreater.resolve_in_o_n("dhck"), is( "dhkc"));
        assertThat(biggerIsGreater.resolve_in_o_n("dkhc"), is( "hcdk"));
    }
}
