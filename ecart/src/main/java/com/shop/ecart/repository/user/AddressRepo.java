package com.shop.ecart.repository.user;

import com.shop.ecart.model.user.Address;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sidharth
 */
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
