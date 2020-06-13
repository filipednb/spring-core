package studying.spring.core.bean.circular.dependency;

public class User {

    private Address address;

    public Address getAddress() {
        return address;
    }
}
