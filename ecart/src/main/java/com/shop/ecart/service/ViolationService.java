package com.shop.ecart.service;

import com.shop.ecart.model.UserEntity;

/**
 * @author Sidharth
 */
public interface ViolationService {
    void deactivate(UserEntity user);
    void ban(UserEntity user);
}
