package com.mrinalgupta.accounts.exceptions;

import com.mrinalgupta.accounts.constants.ResponseConstants;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * The type Resource not found exception.
 */
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {
  /**
   * Instantiates a new Resource not found exception.
   *
   * @param resourceName the resource name
   * @param fieldName the field name
   * @param fieldValue the field value
   */
  public ResourceNotFoundException(String resourceName, String fieldName, String fieldValue) {
    super(String.format(ResponseConstants.RESOURCE_NOT_FOUND, resourceName, fieldName, fieldValue));
  }
}
