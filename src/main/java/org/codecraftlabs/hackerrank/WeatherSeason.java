package org.codecraftlabs.hackerrank;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class WeatherSeason implements Comparable<WeatherSeason> {
    private String name;
    private Set<Integer> temperatures = new TreeSet<>();
    private Integer amplitude = 0;

    public WeatherSeason(String name) {
        this.name = name;
    }

    public String name() {
        return name;
    }

    public void addTemperature(int temperature) {
        temperatures.add(temperature);
        calculateAmplitude();
    }

    Integer amplitude() {
        return amplitude;
    }

    private void calculateAmplitude() {
        List<Integer> items = new LinkedList<>(temperatures);
        if (items.size() > 1) {
            amplitude = items.get(items.size() - 1) - items.get(0);
        } else {
            amplitude = items.get(0);
        }
    }

    @Override
    public int compareTo(WeatherSeason other) {
        return this.amplitude - other.amplitude;
    }

    @Override
    public String toString() {
        return String.format("Season: '%s' / Amplitude: '%d'", name, amplitude);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }

        if (!getClass().equals(other.getClass())) {
            return false;
        }

        WeatherSeason instance = (WeatherSeason) other;
        return name.equals(instance.name);
    }
}
