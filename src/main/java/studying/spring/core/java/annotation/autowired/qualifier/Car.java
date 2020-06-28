package studying.spring.core.java.annotation.autowired.qualifier;

public class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Car -> " + this.getClass().getName());
    }
}
