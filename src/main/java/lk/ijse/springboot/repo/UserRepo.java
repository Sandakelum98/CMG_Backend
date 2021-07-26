package lk.ijse.springboot.repo;

import lk.ijse.springboot.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepo extends MongoRepository<User, String> {
    Optional<User> findUserByUsernameAndPassword(String username, String password);
}
