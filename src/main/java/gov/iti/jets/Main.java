package gov.iti.jets;

import gov.iti.jets.persistent.dao.RepositoryImpl;
import gov.iti.jets.persistent.entity.User;


public class Main {
    public static void main(String[] args) {
       
        User u = new User();

        u.setName("ooo222");

        RepositoryImpl<User,Integer> impl = new RepositoryImpl<>(User.class);
        User us = impl.find(6);

        impl.remove(us);

        // us.setName("mohga");

        // impl.update(us);
        // System.out.println(impl.findAll());
        
    }
}
