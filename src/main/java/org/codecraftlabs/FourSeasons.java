package org.codecraftlabs;

import java.util.*;

public class FourSeasons {
    private static final Integer WINTER = 0;
    private static final Integer SPRING = 1;
    private static final Integer SUMMER = 2;
    private static final Integer AUTUMN = 3;
    private static final String[] SEASONS = {"WINTER", "SPRING", "SUMMER", "AUTUMN"};

    public String solution(int[] values) {
        if (!validateInput(values)) {
            return "";
        }

        int quantity = quantityOfReadingsPerSeason(values);
        Map<Integer, List<Integer>> temps = groupTemperatureReadingsBySeason(values, quantity);
        sortTemperatureReadings(temps);

        int[] amplitudes = calculateAmplitudes(temps, quantity);
        int seasonId = getSeasonIdHighestAmplitude(amplitudes);

        if(seasonId > 3) {
            return "FAIL";
        } else {
            return SEASONS[seasonId];
        }
    }

    private boolean validateInput(int[] values) {
        if ((values.length < 8 || values.length > 200)) {
            return false;
        }

        return values.length % 4 == 0;
    }

    private int quantityOfReadingsPerSeason(int[] values) {
        return values.length / 4;
    }

    private Map<Integer, List<Integer>> groupTemperatureReadingsBySeason(int[] values, int quantity) {
        Map<Integer, List<Integer>> mappedTemps = new HashMap<>();
        mappedTemps.put(WINTER, new ArrayList<>());
        mappedTemps.put(SPRING, new ArrayList<>());
        mappedTemps.put(SUMMER, new ArrayList<>());
        mappedTemps.put(AUTUMN, new ArrayList<>());

        for(int index = 0; index < 4; index++) {
            for(int position = 0; position < quantity; position++) {
                int pos = index * quantity + position;
                mappedTemps.get(index).add(values[pos]);
            }
        }
        return mappedTemps;
    }

    private void sortTemperatureReadings(Map<Integer, List<Integer>> temps) {
        Set<Integer> keys = temps.keySet();
        for(Integer key : keys) {
            List<Integer> item = temps.get(key);
            Collections.sort(item);
        }
    }

    private int[] calculateAmplitudes(Map<Integer, List<Integer>> temps, int quantity) {
        int[] amplitudes = new int[4];
        Set<Integer> keys = temps.keySet();

        for(Integer key : keys) {
            List<Integer> temperatures = temps.get(key);
            int delta = temperatures.get(quantity - 1) - temperatures.get(0);
            amplitudes[key] = delta;
        }
        return amplitudes;
    }

    private int getSeasonIdHighestAmplitude(int[] amplitudes) {
        int seasonIdSelected = 4;
        int highestSoFar = -99999;

        for(int index = 0; index < amplitudes.length; index++) {
            if (amplitudes[index] > highestSoFar) {
                highestSoFar = amplitudes[index];
                seasonIdSelected = index;
            }
        }

        return seasonIdSelected;
    }

}
