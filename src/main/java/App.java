import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld beanTwo =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanTwo.getMessage());
        System.out.println(bean.equals(beanTwo));
        Cat catBeanOne =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanOne.getMessage());
        Cat catBeanTwo =
                (Cat) applicationContext.getBean("cat");
        System.out.println(catBeanTwo.getMessage());
        System.out.println(catBeanOne.equals(catBeanTwo));
    }
}