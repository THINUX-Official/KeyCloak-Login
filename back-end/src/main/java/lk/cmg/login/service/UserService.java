package lk.cmg.login.service;

import lk.cmg.login.dto.UserDTO;

import java.util.List;

/**
 * @author: THINUX
 * @created: 04-Apr-24 - 12:29 PM
 */
public interface UserService {
    void saveUser(UserDTO dto);

    List<UserDTO> getAllUsers();
}