package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.dto.user.LoginDto;
import com.shop.ecart.exception.AuthException;
import com.shop.ecart.model.user.User;
import com.shop.ecart.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author Sidharth
 */
@Service
public class AuthenticationServiceImpl implements AuthenticationService{
    @Autowired
    UserRepo userRepo;

    @Override
    public ApiResponse<User> authenticate(LoginDto loginDto) {
        Optional<User> user = userRepo.findByEmailAndPassword(loginDto.getUsername(),loginDto.getPassword());
        if(user.isPresent()){
            return new ApiResponse(200,"Authenticated",null);
        }else{
            return new ApiResponse(401,"Login Failure!",null);
        }
    }
}
