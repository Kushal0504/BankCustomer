import java.util.*;

class Transaction {
    String id, sender, receiver, status, date;
    double amount;

    Transaction(String id, String sender, String receiver, double amount, String status, String date) {
        this.id = id;
        this.sender = sender;
        this.receiver = receiver;
        this.amount = amount;
        this.status = status;
        this.date = date;
    }

    void display() {
        System.out.println(id + " | " + sender + " -> " + receiver + " | " + amount + " | " + status + " | " + date);
    }
}

class TransactionHistory {
    List<Transaction> transactions = new ArrayList<>();

    void add(Transaction t) {
        transactions.add(t);
    }

    void show() {
        for (Transaction t : transactions) {
            t.display();
        }
    }
}