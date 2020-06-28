package studying.spring.core.java.annotation.autowired.primary;

public class Car extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the Car -> " + this.getClass().getName());
    }
}
