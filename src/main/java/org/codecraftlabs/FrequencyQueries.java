package org.codecraftlabs;

import java.util.*;

public class FrequencyQueries {
    public List<Integer> freqQuery(List<List<Integer>> queries) {
        Map<Integer, Integer> database = new HashMap<>();
        List<Integer> results = new ArrayList<>();

        queries.forEach(line -> {
            Integer operation = line.get(0);
            Integer value = line.get(1);

            switch (operation) {
                case 1:
                    database.put(value, database.getOrDefault(value, 0) + 1);
                    break;
                case 2:
                    if (database.containsKey(value)) {
                        Integer newVal = database.get(value) - 1;
                        if (newVal == 0) {
                            database.remove(value);
                        } else {
                            database.put(value, newVal);
                        }
                    }
                    break;
                default:
                    results.add(hasNumberOfInstances(value, database));
            }

        });

        return results;
    }

    private Integer hasNumberOfInstances(Integer value, Map<Integer, Integer> database) {
        Set<Map.Entry<Integer, Integer>> entries = database.entrySet();
        return entries.parallelStream().filter(item -> item.getValue().equals(value)).count() > 0 ? 1 : 0;
    }
}
