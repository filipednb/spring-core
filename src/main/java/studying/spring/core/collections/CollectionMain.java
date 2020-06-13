package studying.spring.core.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextCollections.xml");

        CollectionHolder holder = applicationContext.getBean(CollectionHolder.class);

        System.out.println(holder.getMyList());
        System.out.println(holder.getMySet());
        System.out.println(holder.getMyMap());
        System.out.println(holder.getMyPlayers());
        System.out.println(holder.getProperties());
        System.out.println(holder.getProperties().getProperty("dataSourceUrl"));

        System.out.println(holder.getMyList().getClass().getName());
        System.out.println(holder.getMySet().getClass().getName());
        System.out.println(holder.getMyMap().getClass().getName());
        System.out.println(holder.getMyPlayers().getClass().getName());
        System.out.println(holder.getProperties().getClass().getName());
    }




}
