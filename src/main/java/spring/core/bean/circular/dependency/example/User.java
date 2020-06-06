package spring.core.bean.circular.dependency.example;

public class User {

    private Address address;

    public Address getAddress() {
        return address;
    }
}
