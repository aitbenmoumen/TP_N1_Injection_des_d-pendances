package pres;

import DAO.DaoImpl;
import DAO.IDao;
import Metier.IMetier;
import Metier.MetierImpl;



public class Pres1 {
    public static void main(String[] args) {
        /**
         *  injection des dependances par instanciation statique => new (Couplage fort)
         *
         *  Pour Eviter ceci on travail avec les fichier (Config.txt) cette methode est bien definie dans Pres2.class
         */

        IDao dao = new DaoImpl();
        IMetier metier = new MetierImpl(dao);

        // ou faire --> metier.setDao(dao);

        System.out.println("RES = "+ metier.calcul());
    }
}
