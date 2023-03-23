package com.example.demo.infrastructure.mapper;

import com.example.demo.domain.entities.Cliente;
import com.example.demo.infrastructure.dto.ClienteDto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
  Cliente toCliente(ClienteDto clienteDto);
  ClienteDto toClienteDto(Cliente cliente);
}
