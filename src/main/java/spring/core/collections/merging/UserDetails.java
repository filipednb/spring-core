package spring.core.collections.merging;

import java.util.Properties;

public class UserDetails extends Details {

    private Properties details;

    @Override
    public Properties getDetails() {
        return details;
    }

    @Override
    public void setDetails(Properties details) {
        this.details = details;
    }

    @Override
    public String toString() {
        return "UserDetails{" +
                "details=" + details +
                '}';
    }
}