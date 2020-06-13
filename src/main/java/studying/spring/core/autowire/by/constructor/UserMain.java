package studying.spring.core.autowire.by.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAutowire-by-constructor.xml");

        System.out.println(applicationContext.getBean(User.class));
    }
}
