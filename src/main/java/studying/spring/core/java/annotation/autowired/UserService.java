package studying.spring.core.java.annotation.autowired;

import org.springframework.beans.factory.annotation.Autowired;

public class UserService {

    @Autowired
    private UserRepository repository;

    public void save() {
        repository.save();
    }

}
