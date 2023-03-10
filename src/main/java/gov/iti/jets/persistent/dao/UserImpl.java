package gov.iti.jets.persistent.dao;

import gov.iti.jets.persistent.dao.interfaces.UserDao;
import gov.iti.jets.persistent.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class UserImpl implements UserDao {
    EntityManagerFactory ef = Persistence.createEntityManagerFactory("default");
    EntityManager em = ef.createEntityManager();
    

    @Override
    public User create() {
        return null;
    }


    @Override
    public User find() {
        return null;
    }

    

}
