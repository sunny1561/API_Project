package com.example.testing;

import org.springframework.data.jpa.repository.JpaRepository;

import jakarta.persistence.Id;

public interface AlienRepository  extends JpaRepository<alien,Integer>{

}
