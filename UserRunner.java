import java.util.Scanner;
public class UserRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Name of user");
        String name = s.nextLine();
        System.out.println("Enter Id of user");
        String id = s.nextLine();
        System.out.println("Enter address of user");
        String address = s.nextLine();
        System.out.println("Enter mobileNumber of user");
        String mobileNumber = s.nextLine();
        User user = new User(id, name, address, mobileNumber);
        user.display();
    }

}
