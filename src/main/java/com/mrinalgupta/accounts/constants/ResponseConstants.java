package com.mrinalgupta.accounts.constants;

/**
 * The type Response constants.
 */
public class ResponseConstants {
  private ResponseConstants() {
    // restrict instantiation
  }

  /**
   * The constant CUSTOMER_ALREADY_EXISTS.
   */
public static final String CUSTOMER_ALREADY_EXISTS =
      "Customer Already registered with given mobile number";

  /** The constant RESOURCE_NOT_FOUND. */
  public static final String RESOURCE_NOT_FOUND =
      "%s not found with the given input data %s : '%s'";
}
