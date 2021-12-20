package com.example.demo.model.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

import com.example.demo.model.entities.Salaire;

public interface SalaireRepository extends JpaAttributeConverter<Salaire, Long>  {

}
