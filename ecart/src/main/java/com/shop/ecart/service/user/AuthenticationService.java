package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.dto.user.LoginDto;
import com.shop.ecart.model.user.User;

import java.util.Optional;

/**
 * @author Sidharth
 */
public interface AuthenticationService {
    ApiResponse<User> authenticate(LoginDto loginDto);
}
