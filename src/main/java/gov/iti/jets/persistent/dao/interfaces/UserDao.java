package gov.iti.jets.persistent.dao.interfaces;

import gov.iti.jets.persistent.entity.User;

public interface UserDao {
   User create();
   User find();
}
