
**Spring Overview**

“Spring framework is a Java platform that provides comprehensive infrastructure support for developing Java applications. Spring handles the infrastructure so you can focus on your application” 

“O framework Spring é uma plataforma Java que provisiona uma infraestrutura de apoio compreensiva  para o desenvolvimento de aplicações Java. Spring lida com a infraestrutura, então você focar na sua aplicação”

**Introducing objects dependencies**

A Java Application is a collection of Objects. In a good application we will have several objects with their own responsibilities. And those objects can be dependent on each other.

**Example:**

UserService depends on UserRepository UserService -> UserRepository

So a way to do is like this:
```java

public class UserService {
    
    private UserRepository repository;
        public UserService() {
        UserRepository repository = new UserRepository();
        this.repository = repository;
    
    }
    
    public void create() {
        repository.save(new User(1L, "Sebastian"));
    }

}

```

**Traditional Way of dependency injection - Drawbacks**

The developer are responsible to manage the object dependencies and object creation

He is also responsible for initializing and providing dependencies to child objects. It can be daunting when there are a large number of them

**Spring Way of dependency injection**



*   We only need to declare and let Spring inject the dependencies for us
*   Spring IoC container is here to help - We provide Spring container bean definitions and let it manage the object creation, initialization, assembling and also manage the dependency graph.
*   Bean definition can be provided through XML bean definition configuration file or through Java annotations

**How Spring IoC Container works**


![drawing](https://docs.google.com/drawings/d/12345/export/png)

**Concept of POJOs and Beans**

“In software engineering, a **P**lain **O**ld **J**ava **O**bject (**POJO**) is an **ordinary Java object, not bound by any special restriction** and not requiring any class path”

A POJO cannot implement or extends any other classes that needs a class path.

When a POJO is inside of a Spring IoC container it is known as Beans.

**Spring IoC Container**



*   ApplicationContext interface represents the Spring IoC Container
*   It is responsible for instantiating, configuring, and assembling the beans
*   Container get its instructions on what objects to instantiate, configure and assemble by reading configuration metadata

There is two different ways of configuring a bean:

**Configuration Metadata - XML File**

Fully configured System

![alt_text](images/image1.png "image_tooltip")
**Ready for **

**Configuration Metadata - Java Config**


![alt_text](images/image2.png "image_tooltip")


In annotation configuration of a bean the method name will be the name of the bean inside IoC container or as this: @Bean(name = “nameOfBean”).

**BeanFactory Interface**



*   Spring’s Dependency Injection functionality is implemented using this BeanFactory interface and its subinterfaces.
*   This is the root interface for accessing a Spring bean container
*   This is the basic client view of a bean container
*   This interface is implemented by objects that hold a number of bean definitions, each uniquely identified by a String name

**ApplicationContext Interface**



*   Central interface to provide configuration for a Spring application
*   This is read-only while the application is running, but may be reloaded if the implementation support this
*   Implement various other interfaces that provides useful features, such as:
    *   EnvironmentCapable
    *   MessageSource
    *   ApplicationEventPublisher

**Demonstration**


![drawing](https://docs.google.com/drawings/d/12345/export/png)

**We can inject that dependency by Constructor or by a Setter method. **

Since you can mix constructor-based and setter-based dependency injection, it is a good rule that you use constructor for mandatory dependencies and setter for optional dependencies.

The Spring team generally advocates constructor injection as it lets you implement components as immutable objects and ensures that required dependencies are not null. Furthermore, constructor-injected components are always returned to the client code in a fully initialized state. As a side note, a large amount of constructor arguments is a bad code smell, implying that the class likely has too many responsibilities and should be refactored to better address proper separation of concerns.

Setter injection should primarily only be used for optional dependencies that can be assigned reasonable default values within the class. Otherwise, not-null checks must be performed everywhere the code uses the dependency. One benefit of setter injection is that you can reinject dependencies when you need to.

**Dependency Resolution Process**



*   The ApplicationContext is created and initialized with configuration metadata
*   For each bean, its dependencies are expressed in the form of properties, constructor arguments or arguments to the static-factory method
*   Each property or constructor argument that is a value is converted from its specified format to the actual type of that property or constructor argument
*   The Spring container validates the configuration of each bean as the container is created

**Circular Dependency**

*   If we use predominantly constructor injection, it is possible to create an unresolvable circular dependency scenario
*   For example: **Class A** requires an instance of **Class B** through constructor injection, and class B requires an instance of Class A through constructor injection.
*   If we configure beans for classes **A** and **B** to be injected into each other, the **Spring IoC** container detects this circular reference at runtime and throw a **BeanCurrentlyCreationException**


```java
public class UserService {

    private UserRepository repository;

    @Autowired // 1←
    private UserRepository repository;

    public UserService(UserRepository repository) { // 2 ←
        this.repository = repository;
    }         
    
    public void setRepository(UserRepository repository){ // 3 ←
        this.repository;
    }
    
        public boolean createUser(int Id, String name) {
            User user = new User(1L, "Sebastian");
            repository.save(user);
    }

}
```