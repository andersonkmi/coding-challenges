package org.codecraftlabs.hackerrank;

import java.util.Stack;
import java.util.UUID;

public class TransactionalStackMkII<T> {
    private Stack<TransactionInfo> transactions = new Stack<>();

    private class TransactionInfo {
        private Stack<T> values = new Stack<>();
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

        Stack<T> getValues() {
            return values;
        }

        void setValues(Stack<T> values) {
            this.values = values;
        }
    }

    public TransactionalStackMkII() {
        TransactionInfo initial = new TransactionInfo();
        initial.setRootTransaction(true);
        transactions.add(initial);
    }

    public void push(T value) {
        transactions.peek().getValues().push(value);
    }

    public T pop() {
        return transactions.peek().values.empty() ? null : transactions.peek().values.pop();
    }

    public T top() {
        return transactions.peek().values.empty() ? null : transactions.peek().values.peek();
    }

    public int size() {
        return transactions.peek().values.size();
    }

    public int getPendingTransactions() {
        return transactions.size() - 1;
    }

    public void begin() {
        TransactionInfo transaction = new TransactionInfo();
        transaction.setValues((Stack<T>) transactions.peek().values.clone());
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
