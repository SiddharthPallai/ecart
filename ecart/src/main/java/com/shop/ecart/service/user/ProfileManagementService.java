package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.model.user.User;

import java.util.List;
import java.util.Optional;

/**
 * @author Sidharth
 */
public interface ProfileManagementService {
    ApiResponse<User> updateProfile(User user);
    ApiResponse<User> deleteProfile(User user);
    List<User> getUsers();
    ApiResponse<User> getUser(Integer id);
    ApiResponse<User> getUserByEmail(String email);
}
