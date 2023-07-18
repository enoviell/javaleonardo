public class UserArrayList implements UserList {
   private User users[];
    private int size;
    private int noUser;
    private static final int DEFAULT_SIZE = 10;

    public UserArrayList() {
        this.size = DEFAULT_SIZE;
        this.users = new User[this.size];
        this.noUser = 0;
    }
    public void addUser(User user) {
       int newSize;
        if (this.noUser == this.size) {
            newSize =  this.size + this.size / 2;
            User newUsers[] = new User[newSize];
            for (int i = 0; i < this.size; i++) {
                newUsers[i] = this.users[i];
            }
            this.users = newUsers;
            this.size = newSize;
        }
        this.users[this.noUser] = user;
        this.noUser++;
    }

    public User getUserById(int id)  throws UserNotFoundException{
        for (int i = 0; i < this.noUser; i++) {
            if (this.users[i].getId() == id) {
                return this.users[i];
            }
        }
        throw new UserNotFoundException("User not found");
    }
    public User getUserByIndex(int index) throws UserNotFoundException {
        if (index < 0 || index >= this.noUser) {
            throw new UserNotFoundException("User not found");
        }
        return this.users[index];
    }
    public int getNumberOfUsers() {
        return this.noUser;
    }
}