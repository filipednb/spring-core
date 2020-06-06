package spring.core.java.annotation.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {

    @Bean
    public Artist artist() {
        return new Artist("Filipe", "Tagliacozzi");
    }

    /*@Bean("AnotherArtist")
    public Artist artist() {
        return new Artist("Sebastian", "Doe");
    }*/

}
