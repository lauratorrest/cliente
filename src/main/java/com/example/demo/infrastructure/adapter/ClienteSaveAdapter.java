package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteSaveService;
import com.example.demo.infrastructure.mapper.ClienteMapper;
import com.example.demo.infrastructure.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteSaveAdapter implements ClienteSaveService {
  private final ClienteRepository clienteRepository;
  private final ClienteMapper clienteMapper;

  @Override
  public Cliente save(Cliente cliente){
    return clienteMapper.toCliente(clienteRepository.save(clienteMapper.toClienteDto(cliente)));
  }

}
