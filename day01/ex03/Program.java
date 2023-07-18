import java.util.UUID;

public class Program {
    public static void main(String[] args) throws InvalidTransactionException, TransactionNotFoundException, UserNotFoundException {
        UserArrayList userList = new UserArrayList();
        UserIdsGenerator userIdsGenerator = UserIdsGenerator.getInstance();
        User manu = new User(UserIdsGenerator.generateId(), "Emanuele", 1000);
        User gianma = new User(UserIdsGenerator.generateId(),"Gianmarco", 200);
        User ale = new User(UserIdsGenerator.generateId(),"Alessio", 2000);
        Transaction transaction1 = new Transaction(manu, gianma, 50, Transaction.Category.CREDIT);
        Transaction transaction2 = new Transaction(ale, gianma, 50, Transaction.Category.CREDIT);
        Transaction transaction3 = new Transaction(ale, gianma, -50, Transaction.Category.DEBIT);

        userList.addUser(manu);
        userList.addUser(gianma);
        userList.addUser(ale);
        System.out.println(userList.getUserById(1).getName());
        System.out.println(userList.getUserByIndex(1).getName());
        System.out.println(userList.getNumberOfUsers());
        TransactionList trs = new TransactionLinkedList();
        trs = userList.getUserById(2).getTransactions();
        trs.addTransaction(transaction1);
        trs.addTransaction(transaction2);
        trs.addTransaction(transaction3);
        trs = userList.getUserById(2).getTransactions();
        Transaction array[] = userList.getUserById(2).getTransactions().toArray();
        System.out.println("GIANMARCO TRANSACTION");
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i].getIdentifier());
        }
        
    }
}