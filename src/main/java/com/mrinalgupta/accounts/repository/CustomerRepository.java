package com.mrinalgupta.accounts.repository;

import com.mrinalgupta.accounts.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface Customer repository.
 */
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
  /**
   * Find by mobile number optional.
   *
   * @param mobileNumber the mobile number
   * @return the optional
   */
  Optional<Customer> findByMobileNumber(String mobileNumber);
}
