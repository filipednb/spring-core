package studying.spring.core.java.annotation.autowired.multi.locations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ArtistConfiguration {

    @Value("#{instrument}")
    private Instrument instrument;

    @Bean
    public Artist artist() {
        return new Artist(instrument);
    }

}
