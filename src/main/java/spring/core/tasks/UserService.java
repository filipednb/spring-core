package spring.core.tasks;

public class UserService {

    private UserRepository repository;

    public void save(User user) {
        repository.save(user);
    }

    public User findUser(long id) {
        return repository.findById(id);
    }

    public void update() {
        repository.update();
    }

    public void delete(long id) {
        repository.delete();
    }

    public void setRepository(UserRepository repository) {
        this.repository = repository;
    }

}
