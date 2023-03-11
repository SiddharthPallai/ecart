package com.shop.ecart.repository.user;

import com.shop.ecart.model.user.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sidharth
 */
public interface AccountRepo extends JpaRepository<Account,Integer> {
}
