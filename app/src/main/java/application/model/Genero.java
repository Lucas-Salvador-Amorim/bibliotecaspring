package application.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.persistence.Table;

@jakarta.persistence.Entity


public class Genero {
    @jakarta.persistence.Id
    @jakarta.persistence.GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    private String nome;

   
}