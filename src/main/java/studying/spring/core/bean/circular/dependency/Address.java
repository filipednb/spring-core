package studying.spring.core.bean.circular.dependency;

public class Address {

    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
