package com.rhm.demo.repositories;

import com.rhm.demo.models.Ninja;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NinjaRepository extends CrudRepository<Ninja, Long> {

    List<Ninja> findAll();

    void deleteById(Long id);







}