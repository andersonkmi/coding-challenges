package org.codecraftlabs;

import static org.hamcrest.CoreMatchers.is;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

class FrequencyQueriesTest {
    private FrequencyQueries cut;

    @BeforeEach
    void setup() {
        cut = new FrequencyQueries();
    }

    @Test
    void testCase001() {
        List<List<Integer>> queries = new ArrayList<>();

        // Insert 1
        List<Integer> query1 = new ArrayList<>();
        query1.add(1);
        query1.add(1);
        queries.add(query1);

        // Insert 2
        List<Integer> query2 = new ArrayList<>();
        query2.add(1);
        query2.add(2);
        queries.add(query2);

        // Insert 1 again
        List<Integer> query3 = new ArrayList<>();
        query3.add(1);
        query3.add(1);
        queries.add(query3);

        // Delete 1
        List<Integer> query4 = new ArrayList<>();
        query4.add(2);
        query4.add(1);
        queries.add(query4);

        // Count 2 instances
        List<Integer> query5 = new ArrayList<>();
        query5.add(3);
        query5.add(2);
        queries.add(query5);

        List<Integer> results = cut.freqQuery(queries);
        assertThat(results.size(), is(1));
        assertThat(results.get(0), is(0));
    }


    @Test
    void testCase002() {
        List<List<Integer>> queries = new ArrayList<>();

        // Insert 1
        List<Integer> query1 = new ArrayList<>();
        query1.add(1);
        query1.add(1);
        queries.add(query1);

        // Insert 2
        List<Integer> query2 = new ArrayList<>();
        query2.add(1);
        query2.add(2);
        queries.add(query2);

        // Insert 1 again
        List<Integer> query3 = new ArrayList<>();
        query3.add(1);
        query3.add(1);
        queries.add(query3);

        // Count 2 instances
        List<Integer> query5 = new ArrayList<>();
        query5.add(3);
        query5.add(2);
        queries.add(query5);

        List<Integer> results = cut.freqQuery(queries);
        assertThat(results.size(), is(1));
        assertThat(results.get(0), is(1));
    }

    @Test
    void testCase003() {
        List<List<Integer>> queries = new ArrayList<>();

        // Insert 1
        List<Integer> query1 = new ArrayList<>();
        query1.add(1);
        query1.add(1);
        queries.add(query1);

        // Insert 2
        List<Integer> query2 = new ArrayList<>();
        query2.add(1);
        query2.add(2);
        queries.add(query2);

        // Insert 1 again
        List<Integer> query3 = new ArrayList<>();
        query3.add(1);
        query3.add(1);
        queries.add(query3);

        // Delete 1
        List<Integer> query4 = new ArrayList<>();
        query4.add(2);
        query4.add(1);
        queries.add(query4);

        // Count 2 instances
        List<Integer> query5 = new ArrayList<>();
        query5.add(3);
        query5.add(3);
        queries.add(query5);

        // Insert 2
        List<Integer> query6 = new ArrayList<>();
        query6.add(1);
        query6.add(2);
        queries.add(query6);

        // Insert 3
        List<Integer> query7 = new ArrayList<>();
        query7.add(1);
        query7.add(3);
        queries.add(query7);

        // Insert 1
        List<Integer> query8 = new ArrayList<>();
        query8.add(1);
        query8.add(1);
        queries.add(query8);

        // Count 2 instances again
        List<Integer> query9 = new ArrayList<>();
        query9.add(3);
        query9.add(2);
        queries.add(query9);

        List<Integer> results = cut.freqQuery(queries);
        assertThat(results.size(), is(2));
        assertThat(results.get(0), is(0));
        assertThat(results.get(1), is(1));
    }

    @Test
    void testCase004() {
        List<List<Integer>> queries = new ArrayList<>();

        List<Integer> item1 = new ArrayList<>();
        item1.add(1);
        item1.add(5);

        List<Integer> item2 = new ArrayList<>();
        item2.add(1);
        item2.add(6);

        List<Integer> item3 = new ArrayList<>();
        item3.add(3);
        item3.add(2);

        List<Integer> item4 = new ArrayList<>();
        item4.add(1);
        item4.add(10);

        List<Integer> item5 = new ArrayList<>();
        item5.add(1);
        item5.add(10);

        List<Integer> item6 = new ArrayList<>();
        item6.add(1);
        item6.add(6);

        List<Integer> item7 = new ArrayList<>();
        item7.add(2);
        item7.add(5);

        List<Integer> item8 = new ArrayList<>();
        item8.add(3);
        item8.add(2);

        queries.add(item1);
        queries.add(item2);
        queries.add(item3);
        queries.add(item4);
        queries.add(item5);
        queries.add(item6);
        queries.add(item7);
        queries.add(item8);

        List<Integer> results = cut.freqQuery(queries);
        assertThat(results.size(), is(2));
        assertThat(results.get(0), is(0));
        assertThat(results.get(1), is(1));

    }
}
