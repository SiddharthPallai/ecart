package com.shop.ecart.service.user;

import com.shop.ecart.model.user.User;

/**
 * @author Sidharth
 */
public interface ViolationService {
    void deactivate(User user);
    void ban(User user);
}
