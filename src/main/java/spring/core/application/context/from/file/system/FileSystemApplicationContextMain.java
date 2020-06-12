package spring.core.application.context.from.file.system;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import spring.core.application.context.multiple.xmls.Album;
import spring.core.application.context.multiple.xmls.Music;

public class FileSystemApplicationContextMain {

    public static void main(String[] args) {

        String path = new FileSystemResource("").getFile().getAbsolutePath();
        ApplicationContext applicationContext = new FileSystemXmlApplicationContext(
                "file://" + path + "/src/main/resources/applicationContext-album.xml",
                "file://" + path + "/src/main/resources/applicationContext-music.xml");
        System.out.println(applicationContext.getBean(Album.class));
        System.out.println(applicationContext.getBean(Music.class));
    }
}