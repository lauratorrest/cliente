package com.example.demo.share;
import org.springframework.http.HttpStatus;
public class ClienteNotFoundException extends BaseException {
  public ClienteNotFoundException(String message) {
    super(HttpStatus.NOT_FOUND, message, ExceptionCode.CLIENTE_NOT_FOUND);
  }

}
