package traditional.way.of.object.injection;

public class UserMain {

    public static void main(String[] args) {
        UserService service = new UserService();
        System.out.println(service.findUser(1));

    }
}
