package com.mrinalgupta.accounts.mapper;

import com.mrinalgupta.accounts.dto.CustomerDto;
import com.mrinalgupta.accounts.entity.Customer;

/**
 * The type Customer mapper.
 */
public class CustomerMapper {
  /**
   * Map to customer dto customer dto.
   *
   * @param customer the customer
   * @param customerDto the customer dto
   * @return the customer dto
   */
public static CustomerDto mapToCustomerDto(Customer customer, CustomerDto customerDto) {
    customerDto.setName(customer.getName());
    customerDto.setEmail(customer.getEmail());
    customerDto.setMobileNumber(customer.getMobileNumber());
    return customerDto;
  }

  /**
   * Map to customer.
   *
   * @param customerDto the customer dto
   * @param customer the customer
   * @return the customer
   */
  public static Customer mapToCustomer(CustomerDto customerDto, Customer customer) {
    customer.setName(customerDto.getName());
    customer.setEmail(customerDto.getEmail());
    customer.setMobileNumber(customerDto.getMobileNumber());
    return customer;
  }
}
