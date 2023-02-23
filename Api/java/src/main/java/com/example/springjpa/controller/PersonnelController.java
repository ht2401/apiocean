package com.example.springjpa.controller;

import com.example.springjpa.model.entity.Personnel;
import com.example.springjpa.model.request.PersonnelRequest;
import com.example.springjpa.service.IPersonnelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personnel")
public class PersonnelController {
    @Autowired
    private IPersonnelService service;

    @GetMapping("all")
    ResponseEntity<List<Personnel>> getAll() {
        List<Personnel> accounts = service.getAll();
        return ResponseEntity.ok(accounts);
    }

    @PostMapping
    ResponseEntity<Personnel> create(@RequestBody PersonnelRequest request) {
        Personnel account = service.create(request);
        return ResponseEntity.ok(account);
    }

    @PutMapping("update/{id}")
    public ResponseEntity<Personnel> update(@PathVariable(name = "id") Long id, @RequestBody PersonnelRequest request) {
        Personnel response = service.update(id, request);
        return ResponseEntity.ok(response);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<List<Personnel>> delete(@PathVariable(name = "id") Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("readOne/{id}")
    public ResponseEntity<Personnel> read(@PathVariable(name = "id") Long id) {
        return ResponseEntity.ok(service.read(id));
    }

    @GetMapping("hour7")
    ResponseEntity<List<Personnel>> getPersonnelByHour () {
        return ResponseEntity.ok(service.getPersonnelByHour());
    }
}
