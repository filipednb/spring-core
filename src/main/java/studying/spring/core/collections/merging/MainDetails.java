package studying.spring.core.collections.merging;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDetails {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextMergingCollections.xml");

        System.out.println(applicationContext.getBean("userDetails"));


    }

}
