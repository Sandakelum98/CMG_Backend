package lk.ijse.springboot.service;

import lk.ijse.springboot.dto.UserDTO;

public interface UserService {
    UserDTO saveUser(UserDTO userDTO);
    UserDTO userLogin(String username, String password);
}
