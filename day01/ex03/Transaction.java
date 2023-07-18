import java.util.UUID;

 public class Transaction{

    static enum Category{
        CREDIT,
        DEBIT
    }
    private UUID identifier;
    private User sender;
    private User receiver;
    private int amount;
    private Category category;
    private Transaction next;


    public Transaction(User sender, User receiver, int amount, Category category){
            this.identifier = UUID.randomUUID();
            this.sender = sender;
            this.receiver = receiver;
            this.category = category;
            if((category == Category.CREDIT && amount < 0 ) || (category == Category.DEBIT && amount >0 )){
                System.out.println("INVALID TRANSACTION");
                this.amount = 0;
            }      
         else if(sender.getBalance() < amount){
                System.out.println("Insufficient balance");
                this.amount = 0;
            }
            else{
                if(category == Category.CREDIT){
                    sender.setBalance(sender.getBalance() - amount);
                    receiver.setBalance(receiver.getBalance() + amount);
                }
                else{
                    sender.setBalance(sender.getBalance() + amount);
                    receiver.setBalance(receiver.getBalance() - amount);
                }
            }
    }
    public UUID getIdentifier(){
        return (this.identifier);
    }
    public User getSender(){
        return (this.sender);
    }
    public User getReceiver(){
        return (this.receiver);
    }
    public int getAmount(){
        return (this.amount);
    }
    public Category getCategory(){
        return (this.category);
    }
    public Transaction getNext(){
        return (this.next);
    }
    public void setNext(Transaction next){
        this.next = next;
    }
}