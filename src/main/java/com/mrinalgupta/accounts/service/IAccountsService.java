package com.mrinalgupta.accounts.service;

import com.mrinalgupta.accounts.dto.CustomerDto;


/**
 * The interface Accounts service.
 */
public interface IAccountsService {

  /**
   * Create account.
   *
   * @param customerDto the customer dto object
   */
void createAccount(CustomerDto customerDto);

  /**
   * Fetch account customer dto.
   *
   * @param mobileNumber the mobile number
   * @return the customer dto
   */
  CustomerDto fetchAccount(String mobileNumber);
}
