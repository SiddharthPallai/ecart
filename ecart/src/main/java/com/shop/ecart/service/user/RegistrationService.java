package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.model.user.User;

import java.sql.Date;
import java.util.Optional;

/**
 * @author Sidharth
 */
public interface RegistrationService {
    ApiResponse createUser(User user);
    boolean isMinor(Date dateOfBirth);
    boolean isUserExist(User user);
}
