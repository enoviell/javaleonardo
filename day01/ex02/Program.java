public class Program {
    public static void main(String[] args) {

    UserIdsGenerator userIdsGenerator = UserIdsGenerator.getInstance(); 
    UserArrayList userList = new UserArrayList();
    User manu = new User(UserIdsGenerator.generateId(),"Emanuele", 100);
    User gianma = new User(UserIdsGenerator.generateId(),"Gianmarco", 200);
    User ale = new User(UserIdsGenerator.generateId(),"Alessio", 200);
    
    userList.addUser(manu);
    userList.addUser(gianma);
    userList.addUser(ale);

    System.out.println(userList.getUserById(1).getName());
    System.out.println(userList.getUserByIndex(1).getName());
    System.out.println(userList.getNumberOfUsers());
    System.out.println(userList.getUserById(10).getName());
    
    }
}