import java.util.UUID;

public class TransactionLinkedList implements TransactionList{
    private Transaction head;
    private int size;

 public  TransactionLinkedList() {
     this.head = null;
     this.size = 0;
 }

 @Override
 public void addTransaction(Transaction transaction){
    if (this.head != null) {
        transaction.setNext(this.head);
    }
    this.head = transaction;
    this.size++;
}


@Override
public void removeTransaction(UUID identifier){
    Transaction previous;
    Transaction temp;

    temp = this.head;
    if(temp.getIdentifier() == identifier){
        this.head = temp.getNext();
        this.size--;
        return;
    }
    while(temp.getNext() != null){
        if (temp.getNext().getIdentifier() == identifier){
            temp.setNext(temp.getNext().getNext());
            this.size--;
            return;
        }
        temp = temp.getNext();
    }
    throw new TransactionNotFoundException("no transaction found with this identifier");
}

public int getSize(){
    return (this.size);
}

@Override
public Transaction[] toArray(){
    Transaction[] array = new Transaction[this.size];
    Transaction temp = this.head;
    for(int i = 0; i < this.size; i++){
        array[i] = temp;
        temp = temp.getNext();
    }
    return (array);
}
}