package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.AccountStatus;
import com.shop.ecart.common.constants.ApiResponse;
import com.shop.ecart.common.constants.ERole;
import com.shop.ecart.model.user.Account;
import com.shop.ecart.model.user.Role;
import com.shop.ecart.model.user.User;
import com.shop.ecart.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.time.Period;
import java.sql.Date;
import java.util.List;

/**
 * @author Sidharth
 */
@Service
@Transactional
public class RegistrationServiceImpl implements RegistrationService{

    @Autowired
    UserRepo userRepo;

    @Override
    public ApiResponse createUser(User user) {
        try{
            if(isUserExist(user)){
                return new ApiResponse(1001,
                        "User already exist by email : "+user.getEmail(),
                        "null");
            }
            if(isMinor(user.getDateOfBirth())){
                return new ApiResponse(1002,
                        "User must be at least 18 years of age : "+user.getEmail(),
                        "null");
            }
            //update the user account
            Account userAcct = new Account();
            userAcct.setCreationDate(Date.valueOf(LocalDate.now()));
            userAcct.setStatus(AccountStatus.ACTIVE);
            user.setAccount(userAcct);
            //update the user role
            Role role = new Role();
            role.setName(ERole.ROLE_ADMIN);
            user.getRoles().add(role);
            userRepo.save(user);
        }catch(Exception e){
            System.out.println(e.getMessage());
            return new ApiResponse(500,"User successfully created",e);
        }
        return new ApiResponse(200,"User successfully created",user);
    }

    @Override
    public boolean isMinor(Date dateOfBirth) {
        //check if user age < 18
        return Period.between(dateOfBirth.toLocalDate(), LocalDate.now()).getYears() < 18;
    }

    @Override
    public boolean isUserExist(User user) {
        //check if user exists
        return userRepo.findByEmail(user.getEmail()).isPresent();
    }

    public List<User> getUsers(){
        return userRepo.findAll();
    }
}