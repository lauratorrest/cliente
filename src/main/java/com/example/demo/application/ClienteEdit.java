package com.example.demo.application;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteEditService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteEdit {

  private final ClienteEditService clienteEditService;

  public void editCliente(Cliente cliente){
    clienteEditService.editCliente(cliente);
  }

}
