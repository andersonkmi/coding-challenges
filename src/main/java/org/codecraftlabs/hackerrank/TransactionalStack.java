package org.codecraftlabs.hackerrank;

import java.util.Stack;
import java.util.UUID;

public class TransactionalStack {
    private Stack<TransactionInfo> transactions = new Stack<>();

    private class TransactionInfo {
        private Stack<Integer> values = new Stack<>();
        private String transactionId;
        private boolean rootTransaction;

        TransactionInfo() {
            transactionId = UUID.randomUUID().toString();
        }

        void setRootTransaction(boolean flag) {
            rootTransaction = flag;
        }

        boolean isRootTransaction() {
            return rootTransaction;
        }

        public String getTransactionId() {
            return transactionId;
        }

        Stack<Integer> getValues() {
            return values;
        }

        void setValues(Stack<Integer> values) {
            this.values = values;
        }
    }

    public TransactionalStack() {
        TransactionInfo initial = new TransactionInfo();
        initial.setRootTransaction(true);
        transactions.add(initial);
    }

    public void push(Integer value) {
        transactions.peek().getValues().push(value);
    }

    public Integer pop() {
        return transactions.peek().values.empty() ? 0 : transactions.peek().values.pop();
    }

    public Integer top() {
        return transactions.peek().values.empty() ? 0 : transactions.peek().values.peek();
    }

    public int size() {
        return transactions.peek().values.size();
    }

    public int getPendingTransactions() {
        return transactions.size() - 1;
    }

    public void begin() {
        TransactionInfo transaction = new TransactionInfo();
        transaction.setValues((Stack<Integer>) transactions.peek().values.clone());
        transactions.push(transaction);
    }

    public boolean commit() {
        TransactionInfo currentTransaction = transactions.peek();
        if(!currentTransaction.isRootTransaction()) {
            TransactionInfo transaction = transactions.pop();
            transactions.peek().setValues(transaction.getValues());
            return true;
        }
        return false;
    }

    public boolean rollback() {
        TransactionInfo currentTransaction = transactions.peek();
        if(!currentTransaction.isRootTransaction()) {
            transactions.pop();
            return true;
        }
        return false;
    }
}
