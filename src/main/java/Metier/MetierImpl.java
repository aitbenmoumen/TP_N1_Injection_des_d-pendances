package Metier;

import DAO.IDao;

/**
 *  L'idee princiale c'est le fait qu'une classe depend que des intefaces
 *  et non pas des classes
 *  --> Donc quand je veux instancier un objet, j'instancie une interface
 *  et j'affecte une objet via les setteurs ou constructeur
 */

public class MetierImpl implements IMetier {
    private IDao dao;
    /**
     * Instancier une interface afin d'avoir un couplage faible
     * Et la valeur null car on a 2 versions et qui va etre determinee
     * dans le main()
     */

    /**
     * injection d'un objet qui implemente l'interface IDao
     * dans la var dao
     */
    public MetierImpl(IDao dao) {
        this.dao = dao; // Injection via constructeur
    }
    public MetierImpl() {   }
    /**
     * Injection par setteur
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul(){
        double temp = dao.getData();
        return (temp * 43) / 3;
    }
}
