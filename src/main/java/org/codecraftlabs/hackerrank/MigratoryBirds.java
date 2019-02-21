package org.codecraftlabs.hackerrank;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigratoryBirds {
    public int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> sightings = arr.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        Map<Long, List<Integer>> items = new TreeMap<>();
        sightings.forEach((key, value) -> {
            if(items.containsKey(value)) {
                items.get(value).add(key);
            } else {
                List<Integer> birds = new ArrayList<>();
                birds.add(key);
                items.put(value, birds);
            }
        });

        Map.Entry<Long, List<Integer>> lastEntry = ((TreeMap<Long, List<Integer>>) items).lastEntry();
        List<Integer> birds = lastEntry.getValue();
        birds.sort(Comparator.naturalOrder());
        return birds.get(0);
    }
}
