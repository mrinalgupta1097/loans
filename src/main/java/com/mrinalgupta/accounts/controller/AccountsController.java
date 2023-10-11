package com.mrinalgupta.accounts.controller;

import com.mrinalgupta.accounts.constants.AccountsConstants;
import com.mrinalgupta.accounts.dto.CustomerDto;
import com.mrinalgupta.accounts.dto.ResponseDto;
import com.mrinalgupta.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * The type Accounts controller.
 */
@RestController
@RequestMapping(
    path = "/api",
    produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class AccountsController {

  private IAccountsService iAccountsService;

  /**
   * Create account response entity.
   *
   * @param customerDto the customer dto
   * @return the response entity
   */
@PostMapping("/create")
  public ResponseEntity<ResponseDto> createAccount(@RequestBody CustomerDto customerDto) {
    iAccountsService.createAccount(customerDto);
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(new ResponseDto(AccountsConstants.STATUS_201, AccountsConstants.MESSAGE_201));
  }

  /**
   * Fetch account details response entity.
   *
   * @param mobileNumber the mobile number
   * @return the response entity
   */
  @GetMapping("/fetch")
  public ResponseEntity<CustomerDto> fetchAccountDetails(@RequestParam String mobileNumber) {
      CustomerDto customerDto = iAccountsService.fetchAccount(mobileNumber);
      return ResponseEntity.status(HttpStatus.OK).body(customerDto);
  }
}
