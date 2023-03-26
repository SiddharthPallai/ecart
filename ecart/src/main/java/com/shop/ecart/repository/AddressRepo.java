package com.shop.ecart.repository;

import com.shop.ecart.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Sidharth
 */
@Repository
public interface AddressRepo extends JpaRepository<Address,Integer> {
}
