package studying.spring.core.java.annotation.autowired.primary;

public class MotorCycle extends Vehicle {

    @Override
    public void drive() {
        System.out.println("Driving the MotorCycle -> " + this.getClass().getName());
    }
}
