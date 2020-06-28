package studying.spring.core.java.annotation.autowired.base.collection;

public class Product {

    private final String id;
    private final String description;

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
