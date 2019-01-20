package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.Coche;

public interface AlienRepository extends CrudRepository<Coche, Integer> {

}
