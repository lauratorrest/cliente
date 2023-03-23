package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteEditService;
import com.example.demo.infrastructure.repository.ClienteRepository;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteEditAdapter implements ClienteEditService {
  private final ClienteRepository clienteRepository;
  @Transactional
  public void editCliente(Cliente cliente) {
    clienteRepository.updateCliente(cliente.getId(),cliente.getNombre(),cliente.getApellido(),cliente.isEstado());
  }
}
