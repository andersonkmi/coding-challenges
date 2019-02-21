package org.codecraftlabs.hackerrank;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;

public class FourSeasonsMkIITest {
    private FourSeasonsMkII cut;

    @Before
    public void setup() {
        cut = new FourSeasonsMkII();
    }

    @Test
    public void testCase001() {
        int[] temps = {-3, -14, -5, 7, 8, 42, 8, 3};

        assertThat(cut.solution(temps), is("SUMMER"));
    }

    @Test
    public void testCase002() {
        int[] temps = {2, -3, 3, 1, 10, 8, 2, 5, 13, -5, 3, -18};
        assertThat(cut.solution(temps), is("AUTUMN"));
    }

    @Test
    public void testCase003() {
        WeatherSeason season = new WeatherSeason("Teste");
        season.addTemperature(100);
        season.addTemperature(30);

        assertThat(season.amplitude(), is(70));
    }

    @Test
    public void testCase004() {
        WeatherSeason season = new WeatherSeason("Teste");
        season.addTemperature(100);
        season.addTemperature(30);
        season.addTemperature(20);

        assertThat(season.amplitude(), is(80));
    }

    @Test
    public void testCase005() {
        WeatherSeason season = new WeatherSeason("Teste");
        season.addTemperature(100);
        season.addTemperature(-70);
        season.addTemperature(-50);

        assertThat(season.amplitude(), is(170));
    }
}

