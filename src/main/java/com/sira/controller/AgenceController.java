package com.sira.controller;

import com.sira.core.entity.Agence;
import com.sira.core.repository.AgenceRepository;

import java.util.List;

public class AgenceController {
    private static AgenceRepository agenceRepository;

    public AgenceController()
    {
        agenceRepository = new AgenceRepository();
    }

    public  void create(Agence agence)
    {
        agenceRepository.create(agence);
    }

    public Agence readOne(int id) {
         return agenceRepository.readOne(id);
    }
    public boolean delete(int id)
    {
        return agenceRepository.delete( id);
    }

    public List<Agence> readAll()
    {
        return agenceRepository.readAll();
    }

}
