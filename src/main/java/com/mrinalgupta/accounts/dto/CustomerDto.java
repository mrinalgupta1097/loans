package com.mrinalgupta.accounts.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

/** DTO for {@link com.mrinalgupta.accounts.entity.Customer} */
@Data
public class CustomerDto {
  /** The Name. */
  @NotEmpty(message = "Name can not be a null or empty")
  @Size(min = 5, max = 30, message = "The length of the customer name should be between 5 and 30")
  String name;

  /** The Email. */
  @NotEmpty(message = "Email address can not be a null or empty")
  @Email(message = "Email address should be a valid value")
  String email;

  /** The Mobile number. */
  @Pattern(regexp = "(^$|[0-9]{10})", message = "Mobile number must be 10 digits")
  String mobileNumber;

  private AccountsDto accountsDto;
}
