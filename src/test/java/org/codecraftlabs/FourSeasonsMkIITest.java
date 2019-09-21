package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

class FourSeasonsMkIITest {
    private FourSeasonsMkII cut;

    @BeforeEach
    void setup() {
        cut = new FourSeasonsMkII();
    }

    @Test
    void testCase001() {
        int[] temps = {-3, -14, -5, 7, 8, 42, 8, 3};

        assertThat(cut.solution(temps), is("SUMMER"));
    }

    @Test
    void testCase002() {
        int[] temps = {2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};
        assertThat(cut.solution(temps), is("AUTUMN"));
    }

    @Test
    void testCase003() {
        WeatherSeason season = new WeatherSeason("Teste");
        season.addTemperature(100);
        season.addTemperature(30);

        assertThat(season.amplitude(), is(70));
    }

    @Test
    void testCase004() {
        WeatherSeason season = new WeatherSeason("Teste");
        season.addTemperature(100);
        season.addTemperature(30);
        season.addTemperature(20);

        assertThat(season.amplitude(), is(80));
    }

    @Test
    void testCase005() {
        WeatherSeason season = new WeatherSeason("Teste");
        season.addTemperature(100);
        season.addTemperature(-70);
        season.addTemperature(-50);

        assertThat(season.amplitude(), is(170));
    }
}

