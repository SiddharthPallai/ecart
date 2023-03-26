package com.shop.ecart.repository;

import com.shop.ecart.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sidharth
 */
@Repository
public interface AccountRepo extends JpaRepository<Account,Integer> {
}
