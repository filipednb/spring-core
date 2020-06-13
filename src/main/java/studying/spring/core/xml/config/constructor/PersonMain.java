package studying.spring.core.xml.config.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextConstructor.xml");

        //Will print arguments coming from xml configuration file based on parameters indexes
        System.out.println(applicationContext.getBean("person"));
    }

}


