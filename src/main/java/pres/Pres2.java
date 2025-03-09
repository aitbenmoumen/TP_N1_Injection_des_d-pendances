package pres;

import DAO.IDao;
import Metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) {
        try {
            // Lire le fichier
            Scanner sc = new Scanner(new File("config.txt"));
            // Lire la premiere ligne de fichier
            String daoClassName = sc.nextLine();

            // Creer un objet de cet type
            Class<?> cDao = Class.forName(daoClassName);

            IDao dao = (IDao) cDao.getConstructor().newInstance();

            // dans le cas generale si on connait pas le type => Object o = cDao.getConstructor().newInstance();

            String metierClassName = sc.nextLine();
            Class<?> cMetier = Class.forName(metierClassName);
            IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
            System.out.println("RES = "+ metier.calcul());

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
