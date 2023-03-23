package com.example.demo.application;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteGetService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteGet {
  private final ClienteGetService clientGetService;

  public Cliente getCliente(String id) {
    return clientGetService.getClinte(id);
  }
}

