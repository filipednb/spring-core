package studying.spring.core.bean.collaboration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CostumerMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextBeanCollaboration.xml");

        System.out.println(applicationContext.getBean("costumer"));

    }

}
