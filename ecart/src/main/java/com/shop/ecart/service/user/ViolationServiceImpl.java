package com.shop.ecart.service.user;

import com.shop.ecart.common.constants.AccountStatus;
import com.shop.ecart.model.user.Account;
import com.shop.ecart.model.user.User;
import com.shop.ecart.repository.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sidharth
 */
public class ViolationServiceImpl implements ViolationService{

    @Autowired
    UserRepo userRepo;
    @Override
    public void deactivate(User user) {

            Account ac = user.getAccount();
            ac.setStatus(AccountStatus.INACTIVE);

            user.setAccount(ac);
            userRepo.save(user);
    }

    @Override
    public void ban(User user) {

    }
}
