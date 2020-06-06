package java.traditional.way.of.injection;

public class UserRepository {

    public void save(User user) {
        System.out.println("Will save user: " + user);
    }

    public User findById(int id) {
        return new User(1, "Sebastian");
    }

    public  void update(User user) {
        System.out.println("Will update user: " + user);
    }

    public void delete(int id) {
        System.out.println("Will delete by id: " + id);
    }
}
