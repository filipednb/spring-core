package studying.spring.core.application.context.multiple.xmls;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AlbumMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext-album.xml", "applicationContext-music.xml");

        System.out.println(applicationContext.getBean(Music.class));
        System.out.println(applicationContext.getBean(Album.class));
    }
}
