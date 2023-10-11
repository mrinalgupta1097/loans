package com.mrinalgupta.accounts.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The type Customer already exists exception.
 */
@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class CustomerAlreadyExistsException extends RuntimeException {
  /**
   * Instantiates a new Customer already exists exception.
   *
   * @param message the message
   */
  public CustomerAlreadyExistsException(String message) {
    super(message);
  }
}
