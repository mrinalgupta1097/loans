package com.mrinalgupta.accounts.repository;

import com.mrinalgupta.accounts.entity.Accounts;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * The interface Accounts repository.
 */
@Repository
public interface AccountsRepository extends JpaRepository<Accounts, Long> {
  /**
   * Find by customer id optional.
   *
   * @param customerId the customer id
   * @return the optional
   */
  Optional<Accounts> findByCustomerId(Long customerId);

  @Transactional
  @Modifying
  void deleteByCustomerId(Long customerId);

}
