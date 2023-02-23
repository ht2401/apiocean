package com.example.springjpa.service;

import com.example.springjpa.model.entity.Personnel;
import com.example.springjpa.model.request.PersonnelRequest;
import com.example.springjpa.repository.PersonnelRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class PersonnelServiceImpl implements IPersonnelService {

    @Autowired
    private PersonnelRepository repository;

    @Override
    public Personnel getPersonnel(Long id) {
        return null;
    }

    @Override
    public List<Personnel> getAll() {
        return repository.findAll();
    }


    @Override
    public Personnel create(PersonnelRequest request) {
        Personnel personnel = new Personnel();
        personnel.setUsername(request.getUsername());
        personnel.setPosition(request.getPosition());
        personnel.setTime_in(request.getTime_in());
        personnel.setTime_out(request.getTime_out());
        repository.save(personnel);
        return personnel;
    }

    @Override
    public Personnel update(Long id, PersonnelRequest request) {
        Personnel personnel = repository.getReferenceById(id);
        personnel.setUsername(request.getUsername());
        personnel.setPosition(request.getPosition());
        personnel.setTime_in(request.getTime_in());
        personnel.setTime_out(request.getTime_out());
        repository.save(personnel);
        return new Personnel();
    }

    @Override
    public void delete (Long id) {
        repository.deleteById(id);
        System.out.println("da xoa roi");;
    }

    @Override
    public Personnel read(Long id) {
        return repository.findById(id).get();
    }
    
    @Override
    public List<Personnel> getPersonnelByHour() {
        return repository.findPersonnelByHour();
    }

}
