package spring.core.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ProductMain {
    public static void main(String[] args) {
        //1 instantiate Spring IoC container
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");

        //2 Get bean information
        //Product product = (Product) applicationContext.getBean("product");
        Product product = applicationContext.getBean("product", Product.class);
        Product product2 = applicationContext.getBean("product2", Product.class);


        //3 Use the bean
        System.out.println(product);
        System.out.println(product2);

    }
}
