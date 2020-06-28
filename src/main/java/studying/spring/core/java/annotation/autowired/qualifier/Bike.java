package studying.spring.core.java.annotation.autowired.qualifier;

public class Bike extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Bike -> " + this.getClass().getName());
    }
}
