package com.sira.controller;

import com.sira.core.entity.Agence;
import com.sira.core.repository.AgenceRepository;
import com.sira.core.service.AgenceService;
import dto.AgenceDto;

import java.util.List;

public class AgenceController {

    public AgenceService agenceService;
    private AgenceRepository agenceRepository;

    public AgenceController()
    {

        this.agenceService = new AgenceService();
        this.agenceRepository = new AgenceRepository();
    }
    /*
    public void afficheDetailEpreuve()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("quel est  l'id  Epreuve ? ");
        Long identifient = scanner.nextLong();
        Epreuve epreuve =  epreuveService.getEpreuve(identifient);
        System.out.println("La classe tournoi est de type :"+ epreuve.getTournoi().getClass().getName());
        System.out.println("Le epreuve sélectionné se deroule en :"+ epreuve.getAnnee()+" il s'agit du tournoi "+ epreuve.getTournoi().getNom());
    }

     */

    public AgenceDto readOne(int id) {
      return agenceService.readOne(id);
    }


    public  void create(Agence agence)
    {
        agenceService.create(agence);
    }

    public void update(Agence agence)
    {
        agenceService.update(agence);
    }


    public boolean delete(int id)
    {
        return agenceRepository.delete( id);
    }

    //Déja Dto
    public List<AgenceDto> readAll()
    {
        return agenceService.readAll();
    }


}
