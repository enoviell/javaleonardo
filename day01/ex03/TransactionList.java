import java.util.UUID;

public interface TransactionList {
    public void addTransaction(Transaction transaction);
    public void removeTransaction(UUID identifier);
    public Transaction[] toArray();
}