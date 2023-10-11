package com.mrinalgupta.accounts.dto;

import lombok.Data;

/** DTO for {@link com.mrinalgupta.accounts.entity.Customer}*/
@Data
public class CustomerDto{
  /**
   * The Name.
   */
String name;
  /**
   * The Email.
   */
String email;

  /** The Mobile number. */
  String mobileNumber;

  private AccountsDto accountsDto;
}
