package com.example.demo.model.repository;

import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;

import com.example.demo.model.entities.User;

public interface UserRepository extends JpaAttributeConverter<User, Long> {

}
