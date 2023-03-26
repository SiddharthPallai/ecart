package com.shop.ecart.service.impl;

import com.shop.ecart.common.constants.AccountStatus;
import com.shop.ecart.model.Account;
import com.shop.ecart.model.UserEntity;
import com.shop.ecart.repository.UserRepo;
import com.shop.ecart.service.ViolationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Sidharth
 */
@Service
public class ViolationServiceImpl implements ViolationService {

    @Autowired
    UserRepo userRepo;
    @Override
    public void deactivate(UserEntity user) {

            Account ac = user.getAccount();
            ac.setStatus(AccountStatus.INACTIVE);

            user.setAccount(ac);
            userRepo.save(user);
    }

    @Override
    public void ban(UserEntity user) {

    }
}
