package DAO;

public class DaoImpl implements IDao{
    @Override
    public double getData(){
        System.out.println("Version de base de donnees");
        return 23;
    }
}
