package com.mrinalgupta.accounts.service;

import com.mrinalgupta.accounts.constants.AccountsConstants;
import com.mrinalgupta.accounts.constants.ResponseConstants;
import com.mrinalgupta.accounts.dto.AccountsDto;
import com.mrinalgupta.accounts.dto.CustomerDto;
import com.mrinalgupta.accounts.entity.Accounts;
import com.mrinalgupta.accounts.entity.Customer;
import com.mrinalgupta.accounts.exceptions.CustomerAlreadyExistsException;
import com.mrinalgupta.accounts.exceptions.ResourceNotFoundException;
import com.mrinalgupta.accounts.mapper.AccountsMapper;
import com.mrinalgupta.accounts.mapper.CustomerMapper;
import com.mrinalgupta.accounts.repository.AccountsRepository;
import com.mrinalgupta.accounts.repository.CustomerRepository;
import java.time.LocalDateTime;
import java.util.Optional;
import java.util.Random;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

/** The type Accounts service. */
@Service
@AllArgsConstructor
public class IAccountsServiceImpl implements IAccountsService {

  private AccountsRepository accountsRepository;
  private CustomerRepository customerRepository;

  /**
   * Create account.
   *
   * @param customerDto the customer dto object
   */
  @Override
  public void createAccount(CustomerDto customerDto) {
    Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
    Optional<Customer> optionalCustomer =
        customerRepository.findByMobileNumber(customerDto.getMobileNumber());
    if (optionalCustomer.isPresent()) {
      throw new CustomerAlreadyExistsException(
          ResponseConstants.CUSTOMER_ALREADY_EXISTS + customerDto.getMobileNumber());
    }
    customer.setCreatedAt(LocalDateTime.now());
    customer.setCreatedBy("Anonymous");
    Customer savedCustomer = customerRepository.save(customer);
    accountsRepository.save(createNewAccount(savedCustomer));
  }

  @Override
  public CustomerDto fetchAccount(String mobileNumber) {
    Customer customer =
        customerRepository
            .findByMobileNumber(mobileNumber)
            .orElseThrow(
                () -> new ResourceNotFoundException("Customer", "mobileNumber", mobileNumber));
    Accounts account =
        accountsRepository
            .findByCustomerId(customer.getCustomerId())
            .orElseThrow(
                () ->
                    new ResourceNotFoundException(
                        "Account", "customerId", customer.getCustomerId().toString()));
    CustomerDto customerDto = CustomerMapper.mapToCustomerDto(customer, new CustomerDto());
    customerDto.setAccountsDto(AccountsMapper.mapToAccountsDto(account, new AccountsDto()));
    return customerDto;
  }

  /**
   * @param customer - Customer Object
   * @return the new account details
   */
  private Accounts createNewAccount(Customer customer) {
    Accounts newAccount = new Accounts();
    newAccount.setCustomerId(customer.getCustomerId());
    long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

    newAccount.setAccountNumber(randomAccNumber);
    newAccount.setAccountType(AccountsConstants.SAVINGS);
    newAccount.setBranchAddress(AccountsConstants.ADDRESS);
    newAccount.setCreatedAt(LocalDateTime.now());
    newAccount.setCreatedBy("Anonymous");
    return newAccount;
  }
}
