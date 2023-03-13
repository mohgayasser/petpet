package gov.iti.jets.persistent.dto.interfaces;

import gov.iti.jets.persistent.dto.UserDTO;

public interface UserDTOServiceInt {
    
    UserDTO create(UserDTO userDTO);
    UserDTO find(UserDTO userDTO);

}
