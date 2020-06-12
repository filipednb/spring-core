package spring.core.bean.lazy.inicialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LazyMainCallingBean {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextLazyInitialization.xml");
        applicationContext.getBean("lazy-initialized");
    }

}
