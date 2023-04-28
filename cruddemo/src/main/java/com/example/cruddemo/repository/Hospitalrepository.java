package com.example.cruddemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.cruddemo.model.Hospital;

@Repository
public interface Hospitalrepository extends JpaRepository<Hospital,Integer> {

}
