import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld") ;
        System.out.println(bean2.getMessage());
        Cat bean3 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean3.getMessage());
        Cat bean4 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean4.getMessage());
        boolean compared = bean ==bean2;
        boolean compared2 = bean3 == bean4;
        System.out.println(compared);
        System.out.println(compared2);


    }

}