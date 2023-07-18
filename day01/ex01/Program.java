public class Program {
    public static void main(String[] args) {

    UserIdsGenerator userIdsGenerator = UserIdsGenerator.getInstance(); 
    User sender = new User(UserIdsGenerator.generateId(),"user1", 100);
    User receiver = new User(UserIdsGenerator.generateId(),"user2", 200);

    System.out.println("user1 id: " + sender.getId() + " balance: " + sender.getBalance());
    System.out.println("user2 id: " + receiver.getId() + " balance: " + receiver.getBalance());
    
    }
}
