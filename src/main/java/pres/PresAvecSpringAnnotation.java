package pres;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAvecSpringAnnotation {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("ext", "Metier");
        IMetier metier = context.getBean(IMetier.class);
        System.out.println("RES : "+ metier.calcul());
    }
}
