package ext;

import DAO.IDao;
import org.springframework.stereotype.Component;

@Component("dao")  // Creation d'un objet DaoImplSpring au moment de lançement
public class DaoImplSpring implements IDao {

    @Override
    public double getData() {
        System.out.println("Version web service Avec Spring XML :");
        double t = 77;
        return t;
    }
}
