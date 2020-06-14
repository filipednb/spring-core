package studying.spring.core.java.annotation.autowired.collection;

public class Product {

    private String id;
    private String description;

    public Product(String id, String description) {
        this.id = id;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
