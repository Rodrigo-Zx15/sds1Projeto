package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dspesquisa.entities.Game;
//JPARepository é uma interface pré pronta do SpringBoot

@Repository
public interface GameRepository extends JpaRepository<Game, Long> {

}
