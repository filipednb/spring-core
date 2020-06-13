package studying.spring.core.xml.config;

import java.beans.ConstructorProperties;

public class Product {

    private final String id;
    private final String name;
    private final String description;

    @ConstructorProperties({"id", "name", "productDescription"})
    public Product(final String id, final String name, final String description) {
        super();
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
