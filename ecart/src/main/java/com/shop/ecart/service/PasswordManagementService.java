package com.shop.ecart.service;

import com.shop.ecart.model.UserEntity;


/**
 * @author Sidharth
 */
public interface PasswordManagementService {
    String reset(UserEntity user);


}
