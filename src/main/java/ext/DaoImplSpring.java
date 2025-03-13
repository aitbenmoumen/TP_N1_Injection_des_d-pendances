package ext;

import DAO.IDao;

public class DaoImplSpring implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service Avec Spring XML :");
        double t = 77;
        return t;
    }
}
