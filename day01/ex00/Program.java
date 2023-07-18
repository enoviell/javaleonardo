public class Program {
    public static void main(String[] args) {

    User sender = new User(1,"user1", 100);
    User receiver = new User(2,"user2", 200);

    Transaction transaction1 = new Transaction(sender, receiver, 100, Transaction.Category.CREDIT);
    System.out.println("User1 balance: " + sender.getBalance());
    System.out.println("User2 balance: " + receiver.getBalance());
    Transaction transaction2 = new Transaction(receiver, sender, 100, Transaction.Category.DEBIT);
    System.out.println("User1 balance: " + sender.getBalance());
    System.out.println("User2 balance: " + receiver.getBalance());

    }
}
