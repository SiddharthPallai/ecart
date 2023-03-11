package com.shop.ecart.service.user;

import com.shop.ecart.model.user.User;

/**
 * @author Sidharth
 */
public interface AuthorizationService {
    boolean authorize(User user);
}
