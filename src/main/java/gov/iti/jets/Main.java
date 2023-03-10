package gov.iti.jets;

import gov.iti.jets.persistent.entity.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory ef = Persistence.createEntityManagerFactory("default");
        EntityManager em = ef.createEntityManager();


        User u = new User();

        u.setName("ooo");
        
        u.setId(10);

        em.merge(u);

        em.getTransaction().begin();

        em.persist(u);

        em.getTransaction().commit();
        
    }
}
