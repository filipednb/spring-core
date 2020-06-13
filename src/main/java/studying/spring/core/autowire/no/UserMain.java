package studying.spring.core.autowire.no;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextAutowire-no.xml");

        System.out.println(applicationContext.getBean(User.class));
    }
}
