package spring.core.bean.depends.on;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InitializerMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextDependsOn.xml");
        InitializerDependent initializer = applicationContext.getBean(InitializerDependent.class);
    }
}
