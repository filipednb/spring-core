package studying.spring.core.bean.depends.on;

public class InitializerDependent {

    public InitializerDependent() {
        System.out.println(InitializerDependent.class.toString() + " was initialized.");
    }
}
