package studying.spring.core.java.annotation.autowired.primary;

import org.springframework.beans.factory.annotation.Autowired;

public class Person {

    @Autowired
    private Vehicle vehicle;

    public void driveVehicle() {
        vehicle.drive();
    }

}
