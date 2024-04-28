package com.riwi.entities;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import lombok.Data;

@Data
@Entity

public class EventEntity {

    @Id
    @GeneratedValue

    private String id; 
    private String nombre;
    private LocalDate fecha;
    private String ubicacion;
    private int capacidad;
}
