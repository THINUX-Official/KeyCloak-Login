package lk.cmg.login.service.impl;

import lk.cmg.login.dto.UserDTO;
import lk.cmg.login.entity.User;
import lk.cmg.login.repo.UserRepo;
import lk.cmg.login.service.UserService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: THINUX
 * @created: 04-Apr-24 - 12:06 PM
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    ModelMapper mapper;

    @Autowired
    UserRepo userRepo;


    @Override
    public void saveUser(UserDTO dto) {
        User user = mapper.map(dto, User.class);
        userRepo.save(user);
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> all = userRepo.findAll();
        return mapper.map(all, new TypeToken<List<UserDTO>>() {
        }.getType());
    }
}
