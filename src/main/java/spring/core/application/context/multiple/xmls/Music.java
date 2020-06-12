package spring.core.application.context.multiple.xmls;

public class Music {

    public Music(String name, String musician) {
        this.name = name;
        this.musician = musician;
    }

    private String name;
    private String musician;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusician() {
        return musician;
    }

    public void setMusician(String musician) {
        this.musician = musician;
    }

    @Override
    public String toString() {
        return "Music{" +
                "name='" + name + '\'' +
                ", musician='" + musician + '\'' +
                '}';
    }
}
