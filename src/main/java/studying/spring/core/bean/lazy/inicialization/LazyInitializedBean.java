package studying.spring.core.bean.lazy.inicialization;

public class LazyInitializedBean {

    private final String helloPhrase;

    public LazyInitializedBean(String helloPhrase) {
        this.helloPhrase = helloPhrase;
        System.out.println(helloPhrase);
    }
}
