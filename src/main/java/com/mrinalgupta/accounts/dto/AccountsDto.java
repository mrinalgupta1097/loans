package com.mrinalgupta.accounts.dto;

import java.io.Serializable;
import lombok.Data;

/** DTO for {@link com.mrinalgupta.accounts.entity.Accounts} */
@Data
public class AccountsDto implements Serializable {
  private Long accountNumber;
  private String accountType;
  private String branchAddress;
}
