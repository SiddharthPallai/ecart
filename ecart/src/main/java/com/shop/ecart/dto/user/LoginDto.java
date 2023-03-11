package com.shop.ecart.dto.user;

import lombok.Data;

/**
 * @author Sidharth
 */
@Data
public class LoginDto {
    String username;
    char[] password;
}
