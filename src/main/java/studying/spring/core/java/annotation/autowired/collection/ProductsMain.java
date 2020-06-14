package studying.spring.core.java.annotation.autowired.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ProductsMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(ProductsConfiguration.class);
        applicationContext.getBean(ProductViewer.class).viewProducts();

    }
}
