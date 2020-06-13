package studying.spring.core.java.annotation.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductConfiguration {

    @Bean
    public Product product() {
        Product product = new Product();
        product.setId(1);
        product.setDescription("Tablet Fire Pro");
        return product;
    }
}
