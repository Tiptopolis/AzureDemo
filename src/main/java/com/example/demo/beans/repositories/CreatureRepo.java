package com.example.demo.beans.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.beans.models.Creature;


public interface CreatureRepo extends JpaRepository<Creature, Integer>{

}
