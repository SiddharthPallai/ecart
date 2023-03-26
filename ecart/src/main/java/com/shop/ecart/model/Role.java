package com.shop.ecart.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @author Sidharth
 */
@Entity
@Table(name = "roles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Role implements Serializable {

   public static final String USER = "USER";
   public static final String ADMIN = "ADMIN";
   public static final String ROLE_USER = "ROLE_USER";
   public static final String ROLE_ADMIN = "ROLE_ADMIN";

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Integer id;
   @Column(length = 200)
   @Length(max = 299)
   private String name;

   public Role(String name){
      this.name = name;
   }
}
