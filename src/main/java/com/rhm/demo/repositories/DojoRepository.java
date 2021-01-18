package com.rhm.demo.repositories;

import java.util.List;

import com.rhm.demo.models.Dojo;
;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface DojoRepository extends CrudRepository<Dojo, Long>{
    //SELECT * FROM DLs
    List<Dojo> findAll();

}