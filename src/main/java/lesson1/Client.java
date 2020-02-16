package lesson1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
//        Registry registry = new Registry();
//        registry.registration();


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        IDocAppointment doctor = context.getBean("DocAppointment", IDocAppointment.class);
        doctor.appointment();
    }
}
