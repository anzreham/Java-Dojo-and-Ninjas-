package com.rhm.demo.services;

import com.rhm.demo.models.Dojo;
import com.rhm.demo.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DojoService {
    private final DojoRepository dojoRepository;

    public DojoService(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    public List<Dojo> getAll() {
        return dojoRepository.findAll();
    }

    public Dojo findById(Long id) {
        return (Dojo) this.dojoRepository.findById(id).orElse(null);
    }

    public Dojo createDojon(Dojo newDojo) {
        return this.dojoRepository.save(newDojo);
    }



    public void deleteDojo(Long id) {
        this.dojoRepository.deleteById(id);
    }



}
