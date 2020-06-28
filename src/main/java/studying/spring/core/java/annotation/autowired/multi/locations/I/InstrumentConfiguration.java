package studying.spring.core.java.annotation.autowired.multi.locations.I;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InstrumentConfiguration {

    @Bean
    public Instrument instrument() {
        return new Instrument("Acoustic Guitar");
    }

}
