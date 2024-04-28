package com.riwi.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.riwi.entities.EventEntity;
import com.riwi.services.Iservices.AbstractService;

import lombok.AllArgsConstructor;



@RestController
@RequestMapping("/api/v1/events")
@AllArgsConstructor
public class EventController {

    private final AbstractService objService;

        @GetMapping
    public ResponseEntity<List<EventEntity>> getAll(){
        return ResponseEntity.ok(this.objService.getAll());
    }

     @GetMapping(path = "/{id}")
    public ResponseEntity<EventEntity>get(@PathVariable Long id){
        return ResponseEntity.ok(this.objService.findById(id)); 
    }

    @PostMapping
    public ResponseEntity<EventEntity> insert(@RequestBody EventEntity objEvent){
       return ResponseEntity.ok(this.objService.save(objEvent));
    }

     @PutMapping(path = "/{id}")

    public ResponseEntity<EventEntity> update(
        @PathVariable Long id,//path variable porque el id viene por URL
        @RequestBody EventEntity event)//request body porque los datos vienen por el cuerpo de la peticion
    {
        return ResponseEntity.ok(this.objService.update(id, event));
    }

     @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        this.objService.delete(id);
        return ResponseEntity.noContent().build();
    }


   
}
