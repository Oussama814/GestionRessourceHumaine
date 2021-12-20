package com.example.demo.model.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.entities.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {

}
