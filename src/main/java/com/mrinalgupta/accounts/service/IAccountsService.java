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

  /**
   *
   * @param customerDto - CustomerDto Object
   * @return boolean indicating if the update of Account details is successful or not
   */
  boolean updateAccount(CustomerDto customerDto);

  /**
   *
   * @param mobileNumber - Input Mobile Number
   * @return boolean indicating if the delete of Account details is successful or not
   */
  boolean deleteAccount(String mobileNumber);

}
