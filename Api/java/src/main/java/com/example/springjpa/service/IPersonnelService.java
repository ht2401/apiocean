package com.example.springjpa.service;

import com.example.springjpa.model.entity.Personnel;
import com.example.springjpa.model.request.PersonnelRequest;

import java.util.List;

public interface IPersonnelService {
    Personnel getPersonnel(Long id);

    List<Personnel> getAll();

    Personnel create(PersonnelRequest request);

    Personnel update(Long id, PersonnelRequest request);

    void delete (Long id );

    Personnel read (Long id);

    List<Personnel> getPersonnelByHour ();
}
