package com.example.demo.infrastructure.adapter;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.domain.service.ClienteGetService;
import com.example.demo.infrastructure.dto.ClienteDto;
import com.example.demo.infrastructure.mapper.ClienteMapper;
import com.example.demo.infrastructure.repository.ClienteRepository;
import com.example.demo.share.ClienteNotFoundException;
import java.util.Objects;
import java.util.Optional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteGetAdapter implements ClienteGetService {
  private final ClienteRepository clienteRepository;
  private final ClienteMapper clienteMapper;

  @Override
  public Cliente getClinte(String id) {
    Optional<ClienteDto>  clienteDto = clienteRepository.findById(id);
    if(Objects.nonNull(clienteDto)){
      return clienteDto.map(clienteMapper::toCliente).orElseThrow(() -> new ClienteNotFoundException("No se encuentra cliente."));
    }
    throw new RuntimeException();
  }

}
