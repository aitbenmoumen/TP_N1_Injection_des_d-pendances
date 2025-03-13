package pres;

import Metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.w3c.dom.ls.LSOutput;

public class PresAvecSpringXML {
    public static void main(String[] args) {
        // pour avoir la possibilite d'utiliser Spring il faut ajouter un objet ApplicationContext
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        /**
         * Au demarrage le spring va lire le fichier config.xml
         * et il va commençer a creer les objets et injecter les dependances
         */
        // recuperation du objet cree par spring dans le fichier xml
        IMetier metier = (IMetier) context.getBean("metier");
        System.out.println("RES = "+ metier.calcul());
    }
}
