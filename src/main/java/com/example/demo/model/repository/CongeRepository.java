package com.example.demo.model.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

import com.example.demo.model.entities.Conge;

public interface CongeRepository extends JpaAttributeConverter<Conge, Long> {

}
