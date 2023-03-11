package com.shop.ecart.repository.user;

import com.shop.ecart.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Sidharth
 */
public interface UserRepo extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
    Optional<User> findByPassword(char[] password);
    Optional<User> findByEmailAndPassword(String email, char[] password);

}
