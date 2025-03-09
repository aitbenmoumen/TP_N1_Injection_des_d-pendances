package pres;

import DAO.DaoImpl;
import Metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl dao = new DaoImpl();
        MetierImpl metier = new MetierImpl(dao);
        System.out.println("RES = "+ metier.calcul());
    }
}
