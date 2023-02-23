package com.example.springjpa.repository;

import com.example.springjpa.model.entity.Personnel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Time;
import java.util.List;
import java.util.Optional;

public interface PersonnelRepository extends JpaRepository<Personnel, Long> {
    Optional<Personnel> findAccountByUsername(String username);
    List<Personnel> findAll();

    @Query (value ="""
            select *from Personnel
            where hour(time_in) >= 7 and hour(time_out) <= 8
            """ ,nativeQuery = true)
    List<Personnel> findPersonnelByHour ();

}
