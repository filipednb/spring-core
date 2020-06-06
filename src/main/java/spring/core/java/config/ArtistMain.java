package spring.core.java.config;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ArtistMain {

    public static void main(String[] args) {

        //We should use the root interface ApplicationContext
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ArtistConfiguration.class);

        //The bean name is the method which returns the bean in configuration
        Artist artist0 = (Artist) applicationContext.getBean("artist");
        System.out.println("By bean: " + artist0);

        Artist artist1 = applicationContext.getBean(Artist.class);
        System.out.println("By class type: " + artist1);

        Artist artist2 = applicationContext.getBean("artist", Artist.class);
        System.out.println("By bean name and class type: " + artist2);

        //Getting by BeanFactory
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(ArtistConfiguration.class);
        System.out.println("Geting from beanFactory " + beanFactory.getBean("artist"));

        //Getting by Beam("CustomName")
        //System.out.println("Geting from beanFactory " + beanFactory.getBean("AnotherArtist"));


    }
}
