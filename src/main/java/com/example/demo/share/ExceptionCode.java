package com.example.demo.share;

public enum ExceptionCode {
  CLIENTE_NOT_FOUND("CLT-001","CLIENTE_NOT_FOUND_EXCEPTION");

  private final String code;
  private final String type;

  ExceptionCode(String code, String type) {
    this.code = code;
    this.type = type;
  }
  public String getCode() {return code;}
  public String getType() {return type;}
}