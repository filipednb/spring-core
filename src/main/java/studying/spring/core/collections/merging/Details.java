package studying.spring.core.collections.merging;

import java.util.Properties;

public abstract class Details {

    Properties details;

    public Properties getDetails() {
        return details;
    }

    public void setDetails(Properties details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "Details{" +
                "details=" + details +
                '}';
    }
}
