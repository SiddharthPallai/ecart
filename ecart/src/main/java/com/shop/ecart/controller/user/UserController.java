package com.shop.ecart.controller.user;

import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.dto.user.LoginDto;
import com.shop.ecart.model.user.User;
import com.shop.ecart.service.user.AuthenticationService;
import com.shop.ecart.service.user.ProfileManagementService;
import com.shop.ecart.service.user.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Sidharth
 */
@RestController
@RequestMapping("api/v1")
public class UserController {
    @Autowired
    RegistrationService registrationService;
    @Autowired
    ProfileManagementService profileManagementService;
    @Autowired
    AuthenticationService authenticationService;

    @PostMapping("/users/signup")
    private ApiResponse signUp(@RequestBody User user){
        return registrationService.createUser(user);
    }

    @PostMapping("/users/signin")
    private ApiResponse<User> signIn(@RequestBody LoginDto loginDto){
        return authenticationService.authenticate(loginDto);
    }

    @GetMapping("/users")
    private List<User> viewAllUsers(){
        return profileManagementService.getUsers();
    }

    @GetMapping("/users/{id}")
    private ApiResponse viewUserById(@PathVariable("id") Integer id){
        return profileManagementService.getUser(id);
    }

    @GetMapping("/users/email/{email}")
    private ApiResponse viewUserByEmail(@PathVariable("email") String email){
        return profileManagementService.getUserByEmail(email);
    }
}
