package com.example.demo.infrastructure.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class ClienteDto {
  @Id
  private String id;
  private String nombre;
  private String apellido;
  private boolean estado;
}
