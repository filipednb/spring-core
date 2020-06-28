package studying.spring.core.java.annotation.autowired.base;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    @Bean
    UserRepository userRepository() {
        return  new UserRepository();
    }

    @Bean
    UserService userService() {
        return new UserService();
    }

}
