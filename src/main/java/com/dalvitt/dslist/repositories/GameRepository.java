package com.dalvitt.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dalvitt.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	
}
