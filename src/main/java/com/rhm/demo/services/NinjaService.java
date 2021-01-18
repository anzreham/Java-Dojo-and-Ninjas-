package com.rhm.demo.services;

import com.rhm.demo.models.Ninja;
import com.rhm.demo.repositories.NinjaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NinjaService {

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }
    public List<Ninja> getAll(){
        return this.ninjaRepository.findAll();
    }

    //Get one license
    public Ninja findByid(Long id) {
        return this.ninjaRepository.findById(id).orElse(null);
    }

    public Ninja createNinja(Ninja ninja) {
        return ninjaRepository.save(ninja);
    }

}
