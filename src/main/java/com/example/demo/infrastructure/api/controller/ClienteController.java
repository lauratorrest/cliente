package com.example.demo.infrastructure.api.controller;

import com.example.demo.application.ClienteEdit;
import com.example.demo.application.ClienteGet;
import com.example.demo.application.ClienteSave;
import com.example.demo.domain.entities.Cliente;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path="/CLT")
public class ClienteController {
  private final ClienteSave clienteSave;
  private final ClienteGet clienteGet;
  private final ClienteEdit clienteEdit;

  @GetMapping(value = "/search")
  public ResponseEntity<Cliente> getCliente(@RequestParam String id){
    return ResponseEntity.ok(clienteGet.getCliente(id));
  }

  @PostMapping(value = "/create")
  public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
    return new ResponseEntity<>(clienteSave.saveCliente(cliente), HttpStatus.CREATED);
  }
  @PutMapping(value = "/edit")
  public void editCliente(@RequestBody Cliente cliente){
    clienteEdit.editCliente(cliente);
  }


}
