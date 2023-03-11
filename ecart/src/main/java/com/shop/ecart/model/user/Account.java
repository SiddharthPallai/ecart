package com.shop.ecart.model.user;

import com.shop.ecart.common.constants.AccountStatus;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

/**
 * @author Sidharth
 */
@Entity
@Table(name = "user_account")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @NotNull
    private AccountStatus status;
    @NotNull
    private Date creationDate;
    @NotNull
    private Date LastloginDate;
}
