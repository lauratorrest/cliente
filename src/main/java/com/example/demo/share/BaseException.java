package com.example.demo.share;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.UUID;
import lombok.Data;
import org.springframework.http.HttpStatus;
@Data
public abstract class BaseException extends RuntimeException {
  private final String message;
  private final String code;
  private final HttpStatus status;
  private final LocalDateTime date;
  private final ExceptionCode exceptionCode;
  private Throwable cause;
  private final String id = UUID.randomUUID().toString();


  protected BaseException(HttpStatus status, String message,
      ExceptionCode exceptionCode) {
    this.status = status;
    this.message = message;
    this.code = exceptionCode.getCode();
    this.date = LocalDateTime.now(ZoneId.systemDefault());
    this.exceptionCode = exceptionCode;
  }
  protected BaseException(HttpStatus status, String message, String code, LocalDateTime date,
      ExceptionCode exceptionCode, Throwable cause) {
    this.status = status;
    this.message = message;
    this.code = code;
    this.date = date;
    this.exceptionCode = exceptionCode;
    this.cause = cause;
  }

}
