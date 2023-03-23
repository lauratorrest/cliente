package com.example.demo.infrastructure.repository;

import com.example.demo.infrastructure.dto.ClienteDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteDto, String> {
  @Query(nativeQuery = true, value = "update cliente_dto set nombre = :nombre,apellido = :apellido, estado = :estado, where id = :id")
  @Modifying
  void updateCliente(@Param("id") String id,
      @Param("nombre") String nombre,
      @Param("apellido") String apellido,
      @Param("estado") boolean estado);
}
