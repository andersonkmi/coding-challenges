package org.codecraftlabs.hackerrank;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.CoreMatchers.not;
import static org.junit.Assert.assertThat;


public class TransactionalStackTest {
    private TransactionalStack cut;

    @Rule
    public Timeout globalTimeout = Timeout.seconds(1);

    @Before
    public void setup() {
        cut = new TransactionalStack();
    }

    @Test
    public void testPeekEmptyStack() {
        assertThat(cut.top(), is(0));
    }

    @Test
    public void testPopEmptyStack() {
        assertThat(cut.pop(), is(0));
    }

    @Test
    public void testSingleElementNoTransaction() {
        cut.push(2);
        assertThat(cut.top(), is(2));
        assertThat(cut.pop(), is(2));
        assertThat(cut.commit(), is(false));
    }

    @Test
    public void testVerifySize() {
        cut.begin();
        cut.push(2);
        assertThat(cut.size(), is(1));
        cut.push(3);
        assertThat(cut.size(), is(2));
        Integer value = cut.pop();
        assertThat(value, is(3));
        assertThat(cut.size(), is(1));
        assertThat(cut.top(), is(2));
    }

    @Test
    public void testSimpleTransaction() {
        cut.begin();
        cut.push(2);
        assertThat(cut.top(), is(2));
        assertThat(cut.getPendingTransactions(), is(1));
        assertThat(cut.commit(), is(true));
        assertThat(cut.getPendingTransactions(), is(0));
        assertThat(cut.commit(), is(false));
    }

    @Test
    public void testRollbackOK() {
        cut.begin();
        cut.push(2);
        assertThat(cut.top(), is(2));
        assertThat(cut.getPendingTransactions(), is(1));
        assertThat(cut.rollback(), is(true));
        assertThat(cut.getPendingTransactions(), is(0));
        assertThat(cut.top(), is(0));
    }

    @Test
    public void testRollbackNotOK() {
        cut.begin();
        cut.push(2);
        assertThat(cut.top(), is(2));
        assertThat(cut.getPendingTransactions(), is(1));
        assertThat(cut.rollback(), is(true));
        assertThat(cut.getPendingTransactions(), is(0));
        assertThat(cut.rollback(), is(false));
    }

    @Test
    public void testMoreComplex() {
        cut.push(4);
        cut.begin();
        cut.push(7);
        cut.begin();
        cut.push(2);
        assertThat(cut.rollback(), is(true));
        assertThat(cut.top(), is(7));
        cut.begin();
        cut.push(10);
        assertThat(cut.commit(), is(true));
        assertThat(cut.top(), is(10));
        assertThat(cut.rollback(), is(true));
        assertThat(cut.top(), is(4));
        assertThat(cut.commit(), is(false));
    }
}
