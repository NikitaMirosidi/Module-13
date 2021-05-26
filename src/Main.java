import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        UserManager manager = new UserManager("https://jsonplaceholder.typicode.com/users");

        User user = new User();
        user.setId(10);
        user.setName("John");

        //System.out.println(manager.createUser(user));
        //System.out.println(manager.updateUser(user, 10));
        //manager.deleteUser(5);
        //manager.getAllUsers();
        //System.out.println(manager.getUserByID(5));
        //System.out.println(manager.getUserByUsername("Kamren"));
        //manager.lastCommentsToFile(7);
        //manager.openedTasks(5);
    }
}