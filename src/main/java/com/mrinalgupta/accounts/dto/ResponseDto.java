package com.mrinalgupta.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

/** The type Response dto. */
@Data
@AllArgsConstructor
public class ResponseDto {
    private String statusCode;
    private String statusMessage;
}
