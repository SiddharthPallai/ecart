package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.model.user.User;
import com.shop.ecart.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 * @author Sidharth
 */
@Service
public class ProfileManagementServiceImpl implements ProfileManagementService{

    @Autowired
    UserRepo userRepo;

    @Override
    public ApiResponse<User> updateProfile(User user) {
        return null;
    }

    @Override
    public ApiResponse<User> deleteProfile(User user) {
        return null;
    }

    @Override
    public List<User> getUsers() {
        List<User> users = userRepo.findAll();
        return users;
    }

    @Override
    public ApiResponse<User> getUser(Integer id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return new ApiResponse(200,"Found User",user);
        } else {
            return new ApiResponse(1003,"No such user exist by id = "+id,null);
        }
    }

    @Override
    public ApiResponse<User> getUserByEmail(String email) {
        Optional<User> user = userRepo.findByEmail(email);
        if (user.isPresent()) {
            return new ApiResponse(200,"Found User",user);
        } else {
            return new ApiResponse(1003,"No such user exist by email = "+email,null);
        }
    }
}
