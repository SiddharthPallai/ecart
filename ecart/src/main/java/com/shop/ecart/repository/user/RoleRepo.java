package com.shop.ecart.repository.user;

import com.shop.ecart.model.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Sidharth
 */
public interface RoleRepo extends JpaRepository<Role,Integer> {
}
