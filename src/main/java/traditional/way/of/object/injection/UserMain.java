package traditional.way.of.object.injection;

public class UserMain {

    public static void main(String[] args) {
        //Way 1
        UserRepository repository = new UserRepository();
        System.out.println("Repository id: " + repository);
        UserService service1 = new UserService(repository);

        //Way 2
        UserService service2 = new UserService();

        System.out.println(service1.findUser(1));
        service2.delete(1);

    }
}
