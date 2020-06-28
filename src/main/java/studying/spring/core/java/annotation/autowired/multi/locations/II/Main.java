package studying.spring.core.java.annotation.autowired.multi.locations.II;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        System.out.println(applicationContext.getBean(Artist.class));
    }
}
