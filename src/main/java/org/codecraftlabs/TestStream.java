package org.codecraftlabs;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        List<Source> items = new ArrayList<>();
        Source item1 = new Source();
        item1.setNumber("10");

        Source item2 = new Source();
        item2.setNumber("20");

        items.add(item1);
        items.add(item2);

        List<Destination> convertedItems = items.stream().map(item -> {
            Destination destination = new Destination();
            destination.setNumber(Integer.parseInt(item.getNumber()));
            return destination;
        }).collect(Collectors.toList());
    }
}
