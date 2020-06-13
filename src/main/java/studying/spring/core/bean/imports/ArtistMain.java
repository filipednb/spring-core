package studying.spring.core.bean.imports;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ArtistMain {

    public static void main(String[] args) {
        //ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextBeanImport-artist.xml");
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextBeanImportInnerBean-artist.xml");
        System.out.println(applicationContext.getBean(Artist.class));
    }

}
