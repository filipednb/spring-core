package studying.spring.core.java.annotation.autowired.base.collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProductsConfiguration {

    @Bean ProductViewer productViewer() {
        return new ProductViewer();
    }

    @Bean
    public Product product1() {
        return new Product("1", "Smartphone 1");
    }

    @Bean
    public Product product2() {
        return new Product("2", "Kindle Paperwhite");
    }

    @Bean
    public Product product3() {
        return new Product("3", "Xiomi mi 9");
    }

    @Bean
    public Product product4() {
        return new Product("4", "Notebook Dell inspiron");
    }
}
