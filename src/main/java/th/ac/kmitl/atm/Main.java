package th.ac.kmitl.atm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ATMConfig.class);

        AtmUI atmUI = context.getBean(AtmUI.class);
        atmUI.run();
    }
}
