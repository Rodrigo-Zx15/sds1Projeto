package com.devsuperior.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dspesquisa.entities.Game;
//JPARepository é uma interface pré pronta do SpringBoot
public interface GameRepository extends JpaRepository<Game, Long> {

}
