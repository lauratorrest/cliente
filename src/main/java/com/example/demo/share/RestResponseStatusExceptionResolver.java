package com.example.demo.share;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Order(Ordered.HIGHEST_PRECEDENCE)
@RequestMapping(MediaType.APPLICATION_JSON_VALUE)
public class RestResponseStatusExceptionResolver {
  @ExceptionHandler(BaseException.class)
  public ResponseEntity<ErrorResponse> ErrorHandler(BaseException ex) {
    return new ResponseEntity<>(ErrorResponse.builder().code(ex.getCode()).message(ex.getMessage())
        .date(ex.getDate().toString()).status(ex.getStatus().value()).
        build(), HttpStatus.valueOf(ex.getStatus().value()));
  }

}
