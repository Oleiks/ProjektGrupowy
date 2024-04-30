package com.example.demo.Grzyb.controllers;


import com.example.demo.Grzyb.dto.GrzybDTO;
import com.example.demo.Grzyb.services.GrzybService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.example.demo.Grzyb.entities.Grzyb;
import java.util.*;

@RestController
@RequestMapping("/api")
public class GrzybController {
    private GrzybService grzybService;

    public GrzybController(GrzybService grzybService) {
        this.grzybService = grzybService;
    }
    @GetMapping("/get")
    public ResponseEntity<List<GrzybDTO>> listGrzybs()
    {
        List<Grzyb> Grzyby;
        Grzyby=this.grzybService.findAll();
        List<GrzybDTO> GrzybyDTO=new ArrayList<>();
        for (Grzyb Grzyb:Grzyby)
        {
            GrzybDTO GrzybDTO=com.example.demo.Grzyb.dto.GrzybDTO.builder().name(Grzyb.getName()).description(Grzyb.getDescription()).imageURL(Grzyb.getImageURL()).build();
            GrzybyDTO.add(GrzybDTO);
        }
        return ResponseEntity.ok(GrzybyDTO);
    }
    @GetMapping("/get/jadalne")
    public ResponseEntity<List<GrzybDTO>> listGrzybyJadalne()
    {
        List<Grzyb> Grzyby;
        Grzyby=this.grzybService.findAll();
        List<GrzybDTO> GrzybyDTO=new ArrayList<>();
        for (Grzyb Grzyb:Grzyby)
        {
            if(Grzyb.getEdible()==true)
            {
                GrzybDTO GrzybDTO=com.example.demo.Grzyb.dto.GrzybDTO.builder().name(Grzyb.getName()).description(Grzyb.getDescription()).imageURL(Grzyb.getImageURL()).build();
                GrzybyDTO.add(GrzybDTO);
            }
        }
        return ResponseEntity.ok(GrzybyDTO);
    }
    @GetMapping("/get/nieJadalne")
    public ResponseEntity<List<GrzybDTO>> listGrzybyNieJadalne()
    {
        List<Grzyb> Grzyby;
        Grzyby=this.grzybService.findAll();
        List<GrzybDTO> GrzybyDTO=new ArrayList<>();
        for (Grzyb Grzyb:Grzyby)
        {
            if(Grzyb.getEdible()==false) {
                GrzybDTO GrzybDTO = com.example.demo.Grzyb.dto.GrzybDTO.builder().name(Grzyb.getName()).description(Grzyb.getDescription()).imageURL(Grzyb.getImageURL()).build();
                GrzybyDTO.add(GrzybDTO);
            }
        }
        return ResponseEntity.ok(GrzybyDTO);
    }
    @DeleteMapping("/delete/{name}")
    public ResponseEntity<Map<String,String>> deleteGrzybByTitle(@PathVariable("name") String name)
    {
        Grzyb Grzyb= grzybService.findByName(name);
        if(Grzyb!=null) {
            grzybService.deleteGrzyb(Grzyb);
            return ResponseEntity.ok(Map.of("message", "Deleted an Grzyb with name: " + name));
        }
        return ResponseEntity.noContent().build();
    }
    @PutMapping("/put")
    public ResponseEntity<Map<String,String>> addGrzyb(@RequestBody GrzybDTO GrzybDTO)
    {
        Grzyb Grzyb= com.example.demo.Grzyb.entities.Grzyb.builder().build();
        grzybService.saveNewGrzyb(Grzyb);
        return ResponseEntity.ok(Map.of("message","Created an Grzyb"));
    }
    @PatchMapping("/patch/{name}")
    public ResponseEntity<Map<String,String>> changeGrzyb(@RequestBody GrzybDTO GrzybDTO, @PathVariable("name") String name)
    {
        Grzyb Grzyb= grzybService.findByName(name);
        if(Grzyb!=null)
        {
            Grzyb.setName(GrzybDTO.getName());
            Grzyb.setDescription(GrzybDTO.getDescription());
            grzybService.saveNewGrzyb(Grzyb);
            return ResponseEntity.ok(Map.of("message","Change an Grzyb"));
        }
        return ResponseEntity.noContent().build();
    }
    @GetMapping("/get/{name}")
    public ResponseEntity<GrzybDTO> getGrzybByName(@PathVariable("name") String name) {
        Grzyb Grzyb= grzybService.findByName(name);
        if (Grzyb != null) {
            GrzybDTO GrzybDTO= com.example.demo.Grzyb.dto.GrzybDTO.builder().name(Grzyb.getName()).description(Grzyb.getDescription()).imageURL(Grzyb.getImageURL()).build();
            return ResponseEntity.ok(GrzybDTO);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
