package studying.spring.core.java.annotation.autowired.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Person {

    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;

    public void driveVehicle() {
        vehicle.drive();
    }

}
