package com.mrinalgupta.accounts.dto;

import java.io.Serializable;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

/** DTO for {@link com.mrinalgupta.accounts.entity.Accounts} */
@Data
public class AccountsDto implements Serializable {
  @NotEmpty(message = "AccountNumber can not be a null or empty")
  @Pattern(regexp = "(^$|[0-9]{10})", message = "AccountNumber must be 10 digits")
  private Long accountNumber;

  @NotEmpty(message = "AccountType can not be a null or empty")
  private String accountType;

  @NotEmpty(message = "BranchAddress can not be a null or empty")
  private String branchAddress;
}
