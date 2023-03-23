package com.example.demo.application;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteGetService;
import com.example.demo.domain.service.ClienteSaveService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@AllArgsConstructor
public class ClienteSave {
  private final ClienteSaveService clienteSaveService;
  private final ClienteGetService clienteGetServices;

  public Cliente saveCliente(Cliente cliente){
    try {
      Cliente clientes = clienteGetServices.getClinte(cliente.getId());
      log.info("Ya hay un paquete alamacenado con el codigo: {}",clientes.getId());
      return null;
    } catch (Exception e) {
      return clienteSaveService.save(cliente);
    }
  }

}
