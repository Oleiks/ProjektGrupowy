package com.example.demo.Grzyb.services;

import com.example.demo.Grzyb.repositories.GrzybRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Grzyb.entities.Grzyb;
import java.util.List;

@Service
public class GrzybService {
    private final GrzybRepository grzybRepository;

    @Autowired
    public GrzybService(GrzybRepository grzybRepository) {
        this.grzybRepository = grzybRepository;
    }
    public void saveGrzyb(Grzyb Grzyb) {
        grzybRepository.save(Grzyb);
    }
    public void saveNewGrzyb(Grzyb Grzyb) {
        grzybRepository.save(Grzyb);
    }
    public Grzyb findByName(String name)
    {
        return grzybRepository.findByName(name);
    }
    public void deleteGrzyb(Grzyb Grzyb)
    {
        grzybRepository.delete(Grzyb);
    }
    public List<Grzyb> findAll() {
        return grzybRepository.findAll();
    }
}
