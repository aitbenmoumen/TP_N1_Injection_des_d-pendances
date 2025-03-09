package Metier;

import DAO.IDao;

public class MetierImpl implements IMetier {
    private IDao dao; // Instancier une interface afin d'avoir

    // un couplage faible
    public MetierImpl(IDao dao) {
        this.dao = dao; // Injection via constructeur
    }
    @Override
    public double calcul(){
        double t = dao.getData();
        return (t*43)/3;
    }
}
