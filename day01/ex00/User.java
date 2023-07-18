public class User{
    public int id;
    public String name;
    public int balance;

    public User(int id, String name, int balance){
    this.id = id;
    this.name = name;
    if (balance < 0) {
        System.out.println("Error: balance cannot be negative, it will be set at 0 by default");
        this.balance = 0;
    }
    else {
        this.balance = balance;
    }
    }

    public int getId(){
        return (this.id);
    }
    public int getBalance(){
        return (this.balance) ;        
    }
    public String getName(){
        return (this.name);
    }
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(int balance){
        if (balance < 0){
            System.out.println("Balance cannot be negative");
             return ;
        }
        else{
            this.balance = balance;
        }
    }
    public void setName(String name){
        this.name = name;
    }
}