package com.mrinalgupta.accounts.mapper;

import com.mrinalgupta.accounts.dto.AccountsDto;
import com.mrinalgupta.accounts.entity.Accounts;

/**
 * The type Accounts mapper.
 */
public class AccountsMapper {
  /**
   * Map to accounts dto accounts dto.
   *
   * @param accounts the accounts
   * @param accountsDto the accounts dto
   * @return the accounts dto
   */
public static AccountsDto mapToAccountsDto(Accounts accounts, AccountsDto accountsDto) {
    accountsDto.setAccountNumber(accounts.getAccountNumber());
    accountsDto.setAccountType(accounts.getAccountType());
    accountsDto.setBranchAddress(accounts.getBranchAddress());
    return accountsDto;
  }

  /**
   * Map to accounts.
   *
   * @param accountsDto the accounts dto
   * @param accounts the accounts
   * @return the accounts
   */
  public static Accounts mapToAccounts(AccountsDto accountsDto, Accounts accounts) {
    accounts.setAccountNumber(accountsDto.getAccountNumber());
    accounts.setAccountType(accountsDto.getAccountType());
    accounts.setBranchAddress(accountsDto.getBranchAddress());
    return accounts;
  }
}
