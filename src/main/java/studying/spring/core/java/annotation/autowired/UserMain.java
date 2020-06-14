package studying.spring.core.java.annotation.autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class UserMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(UserConfiguration.class);

        UserService userService = applicationContext.getBean(UserService.class);
        userService.save();

    }

}
