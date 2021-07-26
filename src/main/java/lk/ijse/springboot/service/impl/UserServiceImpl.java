package lk.ijse.springboot.service.impl;

import lk.ijse.springboot.dto.UserDTO;
import lk.ijse.springboot.entity.User;
import lk.ijse.springboot.exception.ValidationException;
import lk.ijse.springboot.repo.UserRepo;
import lk.ijse.springboot.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper mapper;

    private static final String COLLECTION_NAME = "user";

    @Override
    public UserDTO saveUser(UserDTO userDTO) {

        userRepo.save(mapper.map(userDTO, User.class));

        Optional<User> user = userRepo.findUserByUsernameAndPassword(userDTO.getUsername(), userDTO.getPassword());
        if (user.isPresent()) {
            return mapper.map(user.get(), UserDTO.class);
        }

        return null;
    }

    @Override
    public UserDTO userLogin(String username, String password) {
        System.out.println("service");
        Optional<User> user = userRepo.findUserByUsernameAndPassword(username, password);
        if (user.isPresent()) {
            return mapper.map(user.get(), UserDTO.class);
        }
        return null;
    }
}
