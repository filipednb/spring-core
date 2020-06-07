package traditional.way.of.object.injection;

public class UserService {

    private UserRepository repository;

    public UserService() {
        this.repository = new UserRepository();
        System.out.println("Repository id: " + this.repository);
    }

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public void save(User user) {
        repository.save(user);
    }

    public User findUser(int id) {
        return repository.findById(id);
    }

    public void update(User user) {
        repository.update(user);
    }

    public void delete(int id) {
        repository.delete(id);
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

}
