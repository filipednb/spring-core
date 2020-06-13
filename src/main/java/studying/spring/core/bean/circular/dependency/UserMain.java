package studying.spring.core.bean.circular.dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextCircularDependency.xml");

        System.out.println(applicationContext.getBean("user"));
        System.out.println(applicationContext.getBean("address"));

        //Output error:  Error creating bean with name 'user': Requested bean is currently in creation: Is there an unresolvable circular reference?
    }

}
