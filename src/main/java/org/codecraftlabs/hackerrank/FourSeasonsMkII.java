package org.codecraftlabs.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FourSeasonsMkII {
    private static final int SEASONS = 4;
    private static final int LOWER_BOUND = 8;
    private static final int UPPER_BOUND = 200;
    private static String[] SEASON_NAMES = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};

    public String solution(int[] values) {
        if (!validInput(values)) {
            return "";
        }

        int quantity = quantityOfReadingsPerSeason(values);
        List<WeatherSeason> seasons = groupTemperatureReadingsBySeason(values, quantity);

        Collections.sort(seasons);
        return seasons.get(seasons.size() - 1).name();
    }

    private boolean validInput(int[] values) {
        if ((values.length < LOWER_BOUND || values.length > UPPER_BOUND)) {
            return false;
        }

        return values.length % SEASONS == 0;
    }

    private int quantityOfReadingsPerSeason(int[] values) {
        return values.length / SEASONS;
    }

    private List<WeatherSeason> groupTemperatureReadingsBySeason(int[] values, int quantity) {
        List<WeatherSeason> seasons = new ArrayList<>();

        for(int index = 0; index < SEASONS; index++) {
            List<Integer> readings = new ArrayList<>();
            for(int position = 0; position < quantity; position++) {
                int pos = index * quantity + position;
                readings.add(values[pos]);
            }

            WeatherSeason season = new WeatherSeason(SEASON_NAMES[index]);
            readings.forEach(season::addTemperature);
            seasons.add(season);
        }
        return seasons;
    }
}
