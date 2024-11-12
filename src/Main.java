import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        // Define the container
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//
//        Rectangle rec0 = new Rectangle(); //2
//        System.out.println(rec0.area(5));
//        Rectangle rec00 =new Rectangle(); // 3
//        System.out.println(rec00.area(6));
        //Retrieve
        Rectangle rec1 = context.getBean("rec",Rectangle.class);
        System.out.println(rec1.area(3));
        Circle circle1 = context.getBean("cir",Circle.class);
        System.out.println(circle1.area(3));

    }
}