package com.mrinalgupta.accounts.exceptions;

import com.mrinalgupta.accounts.dto.ErrorResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

/**
 * The type Global exception handler.
 */
@ControllerAdvice
public class GlobalExceptionHandler {
  /**
   * Handle customer already exists exception response entity.
   *
   * @param exception the exception
   * @param webRequest the web request
   * @return the response entity
   */
@ExceptionHandler(CustomerAlreadyExistsException.class)
  public ResponseEntity<ErrorResponseDto> handleCustomerAlreadyExistsException(
      CustomerAlreadyExistsException exception, WebRequest webRequest) {
    ErrorResponseDto errorResponseDTO =
        new ErrorResponseDto(
            webRequest.getDescription(false),
            HttpStatus.BAD_REQUEST,
            exception.getMessage(),
            LocalDateTime.now());
    return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
  }

  /**
   * Handle resource not found exception response entity.
   *
   * @param exception the exception
   * @param webRequest the web request
   * @return the response entity
   */
  @ExceptionHandler(ResourceNotFoundException.class)
  public ResponseEntity<ErrorResponseDto> handleResourceNotFoundException(
      ResourceNotFoundException exception, WebRequest webRequest) {
    ErrorResponseDto errorResponseDTO =
            new ErrorResponseDto(
                    webRequest.getDescription(false),
                    HttpStatus.BAD_REQUEST,
                    exception.getMessage(),
                    LocalDateTime.now());
    return new ResponseEntity<>(errorResponseDTO, HttpStatus.BAD_REQUEST);
  }
}
