package studying.spring.core.java.annotation.autowired.base.collection;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class ProductViewer {

    //@Autowired
    //private List<Product> products;

    @Autowired
    private Map<String, Product> products;

    public void viewProducts() {
        //products.forEach(System.out::println);
        for(Map.Entry<String, Product> product : products.entrySet()) {
            System.out.println(product.getKey() + " => " + product.getValue());
        }
    }

}
