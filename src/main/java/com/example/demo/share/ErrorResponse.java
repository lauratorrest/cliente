package com.example.demo.share;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ErrorResponse {
  private int status;
  private String code;
  private String message;
  private String date;

  public ErrorResponse(int status, String code, String message, String date) {
    this.status = status;
    this.code = code;
    this.message = message;
    this.date = date;
  }
}
