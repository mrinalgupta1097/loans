package com.mrinalgupta.accounts.dto;

import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

/** The type Error response dto. */
@Data
@AllArgsConstructor
public class ErrorResponseDto {

    private String apiPath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTime;
}
